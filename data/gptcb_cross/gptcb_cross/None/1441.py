def find_prev_line():
	if last_char == -1:
		in.seek(last_pos_in_file)
		last_char = in.read_byte()
		
	current_line_end = current_line_start
	
	if current_line_end == 0:
		current_line_end = -1
		current_line_start = -1
		current_pos = -1
		return 
	
	file_pointer = current_line_start -1 
	
	while(True):
		file_pointer -= 1 
		if file_pointer < 0:
			break
		in.seek(file_pointer)
		read_byte = in.read_byte()
		if read_byte == 0xA and file_pointer != last_pos_in_file:
			break
			
	current_line_start = file_pointer + 1
	current_pos = current_line_start