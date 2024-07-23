def nthShortWord(words, n):
    nthShortWord = 0
    shortWord = "notFound"
    for i in range(len(words)):
        if len(words[i]) <= 3:
            nthShortWord += 1;
            if (nthShortWord == n): 
                shortWord = words[i]
                break
    return shortWord