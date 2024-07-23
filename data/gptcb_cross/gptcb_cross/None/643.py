def main(args): 
    string = "aaabbbbbaccc" 
    counter = 1 
    result = "" 
    i = 0 
    
    while i < len(string): 
        for j in range(i + 1, len(string)): 
            if string[i] == string[j]: 
                counter += 1 
        result = result + string[i] + str(counter) 
        string = string.replace(string[i], '') 
    print("result is = " + result)