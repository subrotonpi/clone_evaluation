def compare(s1, s2):
	s1_name_num_pair = s1.split(" ")
	s2_name_num_pair = s2.split(" ")
	diff = s1_name_num_pair[0].lower().casefold() <=> s2_name_num_pair[0].lower().casefold()
	if diff==0:
		n1 = float(s1_name_num_pair[1])
		n2 = float(s2_name_num_pair[1])
		return n1 <=> n2
	return diff