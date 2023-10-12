# Project Outline
The aim of the project is to quantify the changes in the collagen content in murine lungs that have been infected with Mycobacterium tuberculosis and compare this with the amounts of collagen present in healthy or uninfected (vehicle administered) murine lungs.


## I. Methodology - Image-bassed quantitation of collagen
### 1. Determining suitability of available image analysis softwares for collagen quantitation
Ilastik and QuPath were used to qunatify collagen content in lung tissue from TB-infected or healthy mice. 

### 2. Collagen quantitation using QuPath (set 1)



===================================================

## B. Phase II (Investigators: Shatavisha Dasgupta, Amy Barczak, Beth Cimini)

### 1. Testing the reproducibility of the methods used for tiling WSIs and quantifying collagen

### 2. Determining inter-rater agreement (human vs human and human vs QuPath) for collagen quantitation

### 3. Analysis of second set of images
### (i) Image QC and performing tiling and collagen quantitaion on a subset of images
A second set comprising 34 images was received in Sept, 2022. The images were subjected to a visual QC for their staining and scannng quality. All the images were found to be of acceptable quality for further analysis (i.e. no restaining / rescanning required).


example image






As a second QC-step, a subset (n=4) of these images were selected and were converted to tiles of 2048 × 2048 pixels with no overlapping, using the script (exporttiles) from Phase I. This generated a total of 225 tiles, of which 40 tiles (10 tiles per image) were randomly selected and areas of collagen in these tiles were quantified using the classifier developed in Phase I. 

example image
example image

### (ii) Running the images through the collagen quantitation pipeline
--- example images ----

