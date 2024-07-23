def backtrack(constraints, items): 
	result = [] 
	for item in items: 
		if is_valid(item, constraints): 
			result.append(item) 
	return result
def is_valid(item, constraints): 
	for i in range(len(constraints)): 
		if item[i] and constraints[i] == 0: 
			return False 
	return True