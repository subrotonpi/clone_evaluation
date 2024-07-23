def numLetters(s): 
    count = [0] * 26
    for i in range(len(s)): 
        count[ord(s[i]) - ord('a')] += 1
    ans = ""
    for i in range(26): 
        if count[i] != 0: 
            ans += str(count[i]) + chr(i + ord('a'))
    return ans