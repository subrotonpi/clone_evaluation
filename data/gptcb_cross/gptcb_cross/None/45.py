def join(input_list, delimiter): 
    final_string = "" 
    for i in range(len(input_list)-1): 
        final_string += input_list[i] + delimiter 
    final_string += input_list[-1] 
    return final_string