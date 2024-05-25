//Script to automate creating annotations based on a pretrained pixel classifier on WSIs or tiles created from WSIs, and then measuring and exporting the areas, perimeters, and X and Y centroids of these annotations

def minArea = 0.0 // To change
def minHoleArea = 2.0 // To change
def classifierName = "new_classifier_set2" // Change to the name of the pixel classifier

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
