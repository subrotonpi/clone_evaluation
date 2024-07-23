def sort(input_list): 
	for i in range(len(input_list)): 
		for j in range(i + 1, len(input_list)): 
			if input_list[i] > input_list[j]: 
				temp = input_list[i] 
				input_list[i] = input_list[j] 
				input_list[j] = temp 
				
	print("Sorted list is:") 
	for i in range(len(input_list)): 
		print(input_list[i], end=" ")