# Project Outline
The aim of the project is to quantify the changes in the collagen content in murine lungs that have been infected with Mycobacterium tuberculosis and compare this with the amounts of collagen present in healthy or uninfected (vehicle administered) murine lungs. This project also investaigtes the changes in the collagen content of TB-infected murine lungs on receiving drug treatment.


## Methodology - Image-bassed quantitation of collagen
### 1. Determining suitability of available image analysis softwares for collagen quantitation
Ilastik and QuPath were used to quantify collagen content in lung tissue from TB-infected mice and healthy mice. 

### 2. Collagen quantitation using QuPath (set 1)

### 3. Testing the reproducibility of the methods used for tiling WSIs and quantifying collagen

![AB 21_01_08 x-8192_y-28672_w-2048_h-2048_Outlines](https://github.com/COBA-NIH/Barczak_Collagen/assets/139376717/41ab21cf-6df0-475c-bac2-f52c04545585)

Overlay of the annotations created by three human observers and QuPath

### 4. Determining inter-rater agreement (human vs human and human vs QuPath) for collagen quantitation

### 5. Analysis of second set of images
### (i) Image QC and performing tiling and collagen quantitaion on a subset of images
A second set comprising 34 images was received. The images were subjected to a visual QC for their staining and scannng quality. All the images were found to be of acceptable quality for further analysis (i.e. no restaining / rescanning required).


example image






As a second QC-step, a subset (n=4) of these images were selected and were converted to tiles of 2048 × 2048 pixels with no overlapping, using the script (exporttiles) from Phase I. This generated a total of 225 tiles, of which 40 tiles (10 tiles per image) were randomly selected and areas of collagen in these tiles were quantified using the classifier developed in Phase I. 

example image
example image

### (ii) Running the images through the collagen quantitation pipeline
**WORKFLOW**
1. QuPath project (needs to be an empty folder) was created
2. Both sets of images were uploaded and the image type was set to 'brightfield-Other'
3. Each WSI was converted to tiles 2048 x 2048 pixels in size using the 'QuPath_exporttiles' script.
4. Detection of collagen and measurement of the collagenous areas werre performed using the 'threeclass_high_classifier.json' file
5. 
--- example images ----

