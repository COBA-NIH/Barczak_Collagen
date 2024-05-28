## Analysis of the 900 series images received in May, 2024
Total files = 39 tiff images
Sample information

<img width="270" alt="Screenshot 2024-05-21 at 8 56 08 AM" src="https://github.com/broadinstitute/Dasgupta_Projects/assets/139376717/857b00c2-2ab5-4026-91ed-a726f9a7b708">


### 1. A subset of slides were selected at random while ensuring that all the treatment groups were represented
<img width="263" alt="sample_subset_for_tiling" src="https://github.com/broadinstitute/Dasgupta_Projects/assets/139376717/872c3219-8f38-4a8c-a7ee-ef8d40da4100">


### 2. Tiles created from this subset
<img width="199" alt="Screenshot 2024-05-22 at 11 32 25 AM" src="https://github.com/broadinstitute/Dasgupta_Projects/assets/139376717/443ef664-f3ac-4f2f-ba5a-cd8d2234c152">

Total tiles = 902
Average number of tiles / image = ~55


### 3.  A subset of tiles (total=80; 5 tiles/sample) were randomly selected to test the pixel classifier trained on series-700 samples. The subset was selected in a way to include tiles having variable proportions of collagen and tissue.

### 4. Collagen masks exported from QuPath were overlaid on original MT images using CellProfiler - some example overlays below

![900series_classifier_test1](https://github.com/broadinstitute/Dasgupta_Projects/assets/139376717/f9ef8408-711d-493e-842b-25459bcb759e)

<img width="401" alt="900series_testclassifier_3" src="https://github.com/broadinstitute/Dasgupta_Projects/assets/139376717/9f8e6364-912f-4a15-b076-c7604a00ae5f">

![900series_testclassifier_2](https://github.com/broadinstitute/Dasgupta_Projects/assets/139376717/fa0c275f-f5ad-4e9f-9513-aca244a040dd)

![900series_testclassifier_4](https://github.com/broadinstitute/Dasgupta_Projects/assets/139376717/6570ae3b-2664-4ab0-9f3e-9ebc41a2b30c)

### Overall Impression
There is some overcalling in general, but it is avoiding common pitfalls such as incorrectly calling lymphocyte clusters as collagen.
I can retrain the classifier adding some images from 900 series, but the 700 series has very weak staining, so any classifier that can work on 700 series will almost certainly end up overcalling in any images with slightly better staining quality.
