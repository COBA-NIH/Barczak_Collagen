// QuPath script for exporting tiles (2048x2048 pixels) from whole slide images (.tiff/.mrxs etc.)

/**
 * Script to export image tiles (can be customized in various ways).
 */
extension = '.tif'
// Get the current image (supports 'Run for project')
def imageData = getCurrentImageData()

// Define output path (here, relative to project)
def name = GeneralTools.getNameWithoutExtension(imageData.getServer().getMetadata().getName())
def pathOutput = buildFilePath(PROJECT_BASE_DIR, 'tiles', name)
mkdirs(pathOutput)

// To export at full resolution
double downsample = 1

// Create an exporter that requests corresponding tiles from the original & labelled image servers
new TileExporter(imageData)
    .downsample(downsample)   // Define export resolution
    .imageExtension(extension)   // Define file extension for original pixels (often .tif, .jpg, '.png' or '.ome.tif')
    .tileSize(2048)            // Define size of each tile, in pixels
    .annotatedTilesOnly(true) // If true, only export tiles if there is a (classified) annotation present
    .overlap(0)              // Define overlap, in pixel units at the export resolution
    .writeTiles(pathOutput)   // Write tiles to the specified directory

def dirOutput = new File(pathOutput)
for (def file in dirOutput.listFiles()) {
    if (!file.isFile() || file.isHidden() || !file.getName().endsWith(extension))
        continue
    def newName = file.getName().replaceAll("=","-").replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","_")
    if (file.getName() == newName)
        continue
    def fileUpdated = new File(file.getParent(), newName)
    println("Renaming ${file.getName()} ---> ${fileUpdated.getName()}")
    file.renameTo(fileUpdated)
}

println('Done!')
