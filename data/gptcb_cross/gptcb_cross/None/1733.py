def countString(s, searchKey):
	count = ""
	for i in range(len(s)):
		if s[i] == searchKey:
            count += s[i] + "\n"
	
	print(count + "\nNumber of Occurrence of " + searchKey + " is " + str(len(count)) + " in string " + s)