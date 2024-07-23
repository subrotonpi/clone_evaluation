output=test 
lr=5e-5
batch_size=4
source_length=512
data_dir=/home/egk204/PycharmProjects/clone-type-iv/data/scb/
output_dir=model/$output
train_file=$data_dir/scb_pairs.csv
dev_file=$data_dir/scb_pairs.csv
test_file=$data_dir/scb_pairs.csv
epochs=10

pretrained_model=microsoft/codebert-base #Roberta: roberta-base 

csrc=/home/egk204/PycharmProjects/clone-type-iv/src/cross/C4_model/saved_models
saved_model=$csrc/model_paper/test/checkpoint-best-ppl/pytorch_model.bin

for f in $(find /home/egk204/PycharmProjects/clone-type-iv/mutation_for_dl_models/mutants_json/type1/temp/ -name '*.jsonl'); 
do 
    python3 run_con_mutation.py --do_test --model_type roberta --model_name_or_path $pretrained_model --train_filename $train_file --dev_filename $dev_file --output_dir $output_dir --max_source_length $source_length --train_batch_size $batch_size --eval_batch_size $batch_size --learning_rate $lr --num_train_epochs $epochs --test_filename $test_file --load_model_path $saved_model --code $f
done