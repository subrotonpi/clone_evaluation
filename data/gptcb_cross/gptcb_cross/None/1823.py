def solution(X, A): 
  n = len(A) 
	
	# if x greater than the length of array A 
	if X > n:	 
		return -1
		
	# bool array to mark the element of A 
	# one by one 
	m = [False]*X 
	jumped = 0
	
	# check each elements of A and mark them 
	# respective in bool array as true 
	for i in range(n): 
		# element should be between 1 and X 
		# (1 and X are included) 
		if A[i] <= X:			 
			# If the element is not marked 
			# earlier, then mark it and 
			# increment jumped 
			if m[A[i] - 1] == False:	 
				m[A[i] - 1] = True
				jumped += 1
				
				# if all the elements are jumped 
				if jumped == X:			 
					return i 
	return -1