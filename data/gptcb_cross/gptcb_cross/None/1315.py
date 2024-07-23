def isBalanced(s): 
    stack = [] 
    parenthesisMap = {"}":"{",  
                      ")": "(", 
                      "]": "["
                     } 
    if len(s) < 2:
        return False
    for char in s:
        if char in parenthesisMap.keys(): 
            topElement = stack.pop() if stack else '#'
            if parenthesisMap[char] != topElement: 
                return False
        else:
            stack.append(char)

    return not stack