def wf():
    choice = input("What is your choice? (x/o)")
    while choice != 'x' and choice != 'o': 
        print("You must enter x or o!")
        choice = input("What is your choice? (x/o)")
    return choice