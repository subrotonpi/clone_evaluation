def main (args):
    root = None
    op = 0

    while op != 6:
        print("Enter Option:\n1:Insert Front 2:Delete Front 3:Insert Rear 4:Delete Rear 5:Display List 6:Exit")
        op = int(input())

        if op == 1:
            val = int(input("Enter Value: "))
            root = insertNodeFront(val, root)
            display(root)
        elif op == 2:
            root = removeNodeFront(root)
            display(root)
        elif op == 3:
            val = int(input("Enter Value: "))
            root = insertNodeRear(val, root)
            display(root)
        elif op == 4:
            root = removeNodeRear(root)
            display(root)
        elif op == 5:
            display(root)
        else:
            print("Invalid Option")
    
    print("Exited!!!")