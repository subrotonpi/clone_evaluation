def isBalanced(str): 
    if len(str) < 2: 
        return False

    stack = [] 

    for i in range(0, len(str)): 
        ch = str[i] 

        if ch not in parenthesesMapRight and ch not in parenthesesMapLeft: 
            continue
        if ch in parenthesesMapLeft: 
            stack.append(ch) 
        else: 
            if not stack: 
                return False
            if stack.pop() != parenthesesMapRight[ch]: 
                return False
        result = True
  
    # Check Empty Stack 
    if stack: 
        result = False
    return result