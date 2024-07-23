def validName(input, histogram):
	user = ""
	name = input.next()
	tmp = ""
	test = False
 
	while (histogram.hasNext()):
		user = histogram.next()
		tmp += user + " "
		if (name.equalsIgnoreCase(user)):
			test = True
		else:
			test = False
		
	if (test == False):
		print("Name not found")
		user = validName(input, tmp)

	return user