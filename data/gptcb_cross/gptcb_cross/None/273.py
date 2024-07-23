def main(args): 
    print("Enter the String:")
    st = input()
    ar = [0] * 256

    for i in range(len(st)):
        ar[ord(st[i])] = ar[ord(st[i])] + 1
    
    for i in range(256):
        c = chr(i)
        if ar[i] > 0:
            if ar[i] == 1:
                print(c, end = "")
            else:
                print(c + str(ar[i]), end = "")