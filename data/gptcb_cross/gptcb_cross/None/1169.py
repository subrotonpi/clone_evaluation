pass = "admin" 
maxTry = 3
success = False
while maxTry > 0:
    maxTry -=1
    test = input("Insert the admin pass: ")
    
    if pass != test:
        print("You have " + str(maxTry) + " try(es): ")
    else:
        success = True
        break
        
if success:
    print("Access granted")
else:
    print("Access denied")
