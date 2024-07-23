def toJavaMethodName(nonJavaMethodName):
	nameBuilder = ""
	capitalizeNextChar = False
	first = True
	for i in range(len(nonJavaMethodName)):
		c = nonJavaMethodName[i]
		if not c.isalnum():
			if not first:
				capitalizeNextChar = True
		else:
			nameBuilder += (c.upper() if capitalizeNextChar else c.lower())
			capitalizeNextChar = False
			first = False
	return nameBuilder