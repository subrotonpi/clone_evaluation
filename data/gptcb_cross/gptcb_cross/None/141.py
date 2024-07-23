valid = 6
s = input("Enter your username: ")
if len(s) < valid:
    print("Enter a valid username")
    print("User name must contain" + str(valid) + " characters")
    s = input("Enter again: ")
print("Username accepted: " + s)
a = int(input("Enter your age: "))
print("Age accepted: " + str(a))
sex = input("Enter your sex: ")
print("Sex accepted: " + sex)
