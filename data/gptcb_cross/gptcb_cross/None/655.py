list = []
add_more = 'y'
while add_more == 'y':
    print(f"Current list is {list}")
    add_more = input("Add more? (y/n)")
    if add_more == 'y':
        item = input("Enter: ")
        list.append(item)
    else:
        break
print(f"List is {list}")
arr = list
print(f"Array is {arr}")
