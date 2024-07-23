pass = "admin"
test = input("Insert the admin pass: ")
if pass == test:
  print("Access granted")
else:
for i in range(1, 3):
  test = input(f"You have {i} try(es): ")
  if pass == test:
    print("Access granted")
    break
  elif i == 2:
    print("Access denied")
    
