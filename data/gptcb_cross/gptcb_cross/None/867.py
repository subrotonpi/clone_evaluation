def main(args):
    fileName = open("hello.txt")
    try:
        startToken="Hello"
        endToken="Bye"
        output=False
        for line in fileName:
            if not output and startToken in line:
                output=True
                line=line[line.index(startToken) + len(startToken):]
            elif output and endToken in line:
                output=False
                print(line[:line.index(endToken)])
            if output:
                print(line)
    except FileNotFoundError:
        print(error)