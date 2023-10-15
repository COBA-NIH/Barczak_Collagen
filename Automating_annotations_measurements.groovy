#Script to automate creating annotations based on a pretrained pixel classifier on whole slide images or tiles created from whole slide images and then measuring the areas, perimeters, and X and Y centroids of these measurements

def minArea = 0.0 // To change
def minHoleArea = 10.0 // To change
def classifierName = "threeclass_full" // To change

// Select all annotations
selectAnnotations()

// Apply pixel classifier inside them
// Note: you can change this to createDetectionsFromPixelClassifier(..) if needed
createAnnotationsFromPixelClassifier(classifierName, minArea, minHoleArea)

// You could also filter out the small area that might be irrelevant?
getAnnotationObjects().forEach {
    print it.getROI().getArea()
}

print "Done!"
