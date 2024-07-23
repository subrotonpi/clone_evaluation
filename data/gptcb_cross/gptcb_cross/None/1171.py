with open('file.txt','rt') as infile:
    lines = infile.readlines()
    text = "".join(lines)
    print(text)
