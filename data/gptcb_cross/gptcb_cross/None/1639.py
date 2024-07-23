def main(): 
    s = "harikrishna"
    s2 = ""
    for i in range(len(s)):
    	found = False
    	for j in range(len(s2)):
    		if s[i] == s2[j]:
    			found = True
    			break
    	if found == False:
    		s2 += s[i]
    print(s2)

main()