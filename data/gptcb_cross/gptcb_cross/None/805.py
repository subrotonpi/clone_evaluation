def main():
    hm = dict()
    print("Enter a String:")
    s1 = input()
    for i in range(len(s1)):
        if s1[i] not in hm:
            hm[s1[i]] = 1
        else:
            hm[s1[i]] += 1
    print("The characters are: ", hm)