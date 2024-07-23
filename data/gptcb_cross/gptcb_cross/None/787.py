def main(): 
    ch = input("Enter the Statement: ")
    count = 0
    len = len(ch)

    while len != 1: 
        name = list(ch)
        len = len(name)
        count = 0
        for j in range(len): 
            if ord(name[0]) >= 65 and ord(name[0]) <= 91 or ord(name[0]) >= 97 and ord(name[0]) <= 123: 
                if name[0] == name[j]: 
                    count += 1

        if count != 0: 
            print(name[0] + ' ' + str(count) + ' Times')
        ch = ch.replace(name[0], '')