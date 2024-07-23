def main(args):
    length = len(args)
    if length > 0:
        print("\n\t", end="")
        for i in range(length):
            print(args[i], end=" ")
        print("\n\t", end="")
        while length > 0:
            print(args[length-1],  end=" ")
            length -= 1
        print("")
    else:
        print("\n\tUsage: java echo <args:String[]>")