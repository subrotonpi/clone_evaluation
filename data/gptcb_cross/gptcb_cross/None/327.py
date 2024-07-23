passcode = "admin"
input_str = input("Insert the admin pass: ")
if input_str == passcode:
    print("Access granted")
else:
    for i in range(1,3):
        input_str = input(f"You have {i} try(es): ")
        if input_str == passcode:
            print("Access granted")
            break
    else:
        print("Access denied")
