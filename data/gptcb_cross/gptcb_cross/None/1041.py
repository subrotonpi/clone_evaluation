def validName(input, histogram): 
    user = ""
    name = input.next() 
    if(histogram.findInLine(name) != None): 
        print("This name exists") 
    else: 
        print("Name not found") 
        user = validName(input, histogram) 
    return user