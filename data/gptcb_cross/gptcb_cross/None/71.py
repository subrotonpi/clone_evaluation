def switchPairs(self):
	if (self is None) or (self.next == None):
		return self
	top = self.next
	first = self
	second = first.next
	while True:
		third = second.next
		second.next = first 
		first.next = third 
		first = third
		print("@@@" + self.toString())
		if (first != None): 
			second.next.next = first.next
			second = first.next
		if (first == None) or (second == None): 
			break
	return top