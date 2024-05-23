// Use pixel classifier to create annotations

def minArea = 0.0 // To change
def minHoleArea = 5.0 // To change
def classifierName = "three_class_high_retrained" // Change to the name of the pixel classifier

// Select all annotations
selectAnnotations()

// Apply pixel classifier inside them
// Note: you can change this to createDetectionsFromPixelClassifier(..) if needed
createAnnotationsFromPixelClassifier(classifierName, minArea, minHoleArea)

// You could also filter out the small area that might be irrelevant?
getAnnotationObjects().forEach {
    print it.getROI().getArea()
}

// Deriving pixels from image annotations of multiple classes 

def imageData = getCurrentImageData()

// Define output path (relative to project)
def outputDir = buildFilePath(PROJECT_BASE_DIR, 'export_fulllabeledimage')
mkdirs(outputDir)
def name = GeneralTools.stripExtension(imageData.getServer().getMetadata().getName())
def path = buildFilePath(outputDir, name + "-labels.png")

// Define how much to downsample during export (may be required for large images)
//double downsample = 4

// Create an ImageServer where the pixels are derived from annotations
def labelServer = new LabeledImageServer.Builder(imageData)
  .backgroundLabel(0, ColorTools.WHITE) // Specify background label (usually 0 or 255)
  .addLabel('Tissue', 1)      // Choose output labels (the order matters!)
  .addLabel('Collagen', 2)
  .addLabel('Air', 3)
  .multichannelOutput(false) // If true, each label refers to the channel of a multichannel binary image (required for multiclass probability)
  .build()

// Write the image
writeImage(labelServer, path)

print "Done!"
