# Code for paper, "On the Use of Deep Learning Models for Semantic Clone Detection", ICSME 2024

The following steps can be followed to reproduce the results of our work.

- The datasets are available in the "data/" directory
- Mutation-based modified data can be found in "mutation_for_dl_models"
- For the models, please take a look at those papers' official repository.
  - We used, ASTNN, GMN, CodeBERT, CLCDSA, and C4 models.
  - However, a version is included in this repo as well under the "src/" directory
  - Cross-lang models: src/cross
  - Single-language models: src/models
- Datasets are already preprocessed.
  - To do it again, run codes under "dataset_formatting_misc". Some processing helper codes are under each dataset folder.
- To use your dataset, please take a look at the dataset format.
  -  Data is a JSON list of functions
    - an entry in data looks like this: {"idx": function} 
  - Clone pair are two functions with a label 1/0 whether they are clones or not. 
    - an entry in pairs looks like this: "id1", "id2", "label"


## Mutation-based code modification for deep learning models.

This implementation considers operators responsible for type-1/type-2/type-3 clones and can alter the code.

Type-1
  - mCW_A Addition of whitespace
  - mCW_R Removal of whitespace
  - mCC_BT Change in between token (/* */) comments
  - mCC_EOL Change in end of line (//) comments
  - mCF_A Change in formatting (addition of a newline)
  - mCF_R Change in formatting (removal of a newline)

Type-2:
- mSRI = Systematic renaming of an identifier
- mARI = Arbitrary renaming of an identifier
- mRL_N = Change in value of a numeric literal
- mRL_S = Change in value of a string or character literal
- 
Type-3:
- mSIL = Small insertion within a line
- mSDL = Small deletion within a line
- mIL = line insertion
- mDL = line deletion
- mML = modification of whole line


### Reference:
Svajlenko, Jeffrey, and Chanchal K. Roy. "The mutation and injection framework: Evaluating clone detection tools with mutation analysis." IEEE Transactions on Software Engineering 47, no. 5 (2019): 1060-1087.  [Link to original implementation](https://github.com/jeffsvajlenko/MutationInjectionFramework).
