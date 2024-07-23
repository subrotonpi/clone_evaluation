def decrypt(msg): 
    regex = re.compile(r"((\d\d)(#)|(\d))") 
    regexMatcher = regex.search(msg) 
    result = [] 
    while regexMatcher: 
        if regexMatcher.group(2) == None: 
            c = regexMatcher.group(1) 
        else: 
            c = regexMatcher.group(2) 
        result.append(chr((int(c) + ord('a')) - 1)) 
        regexMatcher = regex.search(msg, regexMatcher.end()) 
    return "".join(result)