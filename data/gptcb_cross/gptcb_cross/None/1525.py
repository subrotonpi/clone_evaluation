def main(*a):
    print("Enter the String")
    sc = input()
    str = sc.replace(" ", "")
    ar = [0] * 256
    for i in range(len(str)):
        ar[ord(str[i])] = ar[ord(str[i])] + 1
    for i in range(256):
        ch = chr(i)
        if ar[i] > 0:
            if ar[i] == 1:
                print(ch, end="")
            else:
                print(ch + str(ar[i]), end="")