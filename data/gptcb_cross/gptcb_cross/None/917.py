def compare(o1, o2):
	print("Compare(" + o1 + "," + o2 + ")")
	a1 = list(o1)
	a1.sort()
	a2 = list(o2)
	a2.sort()
	return "".join(a1).compare("".join(a2))