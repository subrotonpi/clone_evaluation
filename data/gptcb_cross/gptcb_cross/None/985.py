valid = 6
s = input("Enter your username: ")
while len(s) < valid:
    print ("Enter a valid username")
    print ("User name must contain " + str(valid) + " characters")
    print ("Enter again: ")
    s = input() 
print("Username accepted: " + s) 
age = int(input("Enter your age: "))
print("Age accepted: " + str(age)) 
sex = input("Enter your sex: ")
print("Sex accepted: " + sex) 
