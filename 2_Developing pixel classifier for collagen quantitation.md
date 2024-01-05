# Description of the steps followed for developing a pixel classifier for quantitating collagen fibers in histology images

## I. Developing pixel classifier

To automate the detection and quantitation of collagen in sections of murine lung tissue stained with Masson’s Trichrome (MT), a pixel classifier was developed in QuPath. To efficiently train the pixel classifier, representative images (.mrxs files) were carefully selected from the dataset and smaller sections (tiles) were extracted using the region annotation class in QuPath and were combined in a collage to form an image that was more representative of the full variance of the dataset. The pixel classifier was then trained using three different classes - collagen, tissue, and background (blank areas of the slide). These classes were annotated in the images using the brush tool or the rectangular annotator tool. To ensure greater accuracy of the pixel classifier, areas of similar size for the three classes were annotated on the images. Next, a RTrees pixel classifier was created with the full resolution the the following features: Gaussian, Laplacian of Gaussian, Hessian min max and middle eigenvalues and Structure tensor in max and middle eigenvalues. 

To check the accuracy of the classifier, three researchers were provided eight tiles from the larger images and were asked to manually annotate areas of collagen, tissue, and background using QuPath. Annotations made by the researchers were exported using a script in QuPath and compared with those produced by the pixel classifier by using a pipeline in CellProfiler which helped identify areas of (non)overlap between the annotators and the pixel classifier.

## II. Measuring inter-observer agreement (machine annotations vs human annotations, human annotations vs human annotations)

1. To test the performance of the pixel classifier, a representative set of eight image tiles, having varying proportions of collagen content (determined by visual inspection) was selected from eight samples, and provided to three researchers (A.B, M.G., and S.D) to manually annotate areas as - lung tissue (areas stained red-brown by MT), collagen (areas stained blue by MT), and airspaces (blank areas within the tissue section). For comparing with the human annotations, these tiles were also analyzed using the pixel classifier in QuPath, to generate the same three classes of annotations.

2. Next, for each observer and for QuPath, the annotated areas were exported as masks, to compare the areas of (non)overlap using CellProfiler (Collagen_3annotator_comparison.cppipe).

3. 
