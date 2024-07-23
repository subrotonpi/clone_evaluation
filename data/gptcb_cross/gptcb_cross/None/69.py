def main():
    valid = 6
    s = input("Enter your username: ")
    if len(s) < valid:
        print("Enter a valid username")
        print("Username must contain " + str(valid) + " characters")
        print("Enter again:")
        s = input()
    print("Username accepted: " + s)
    try:
        a = int(input("Enter your age: "))
        print("Age accepted: " + str(a))
    except ValueError:
        print("Please enter a valid age.")
    sex = input("Enter your sex: ")
    print("Sex accepted: " + sex)

if __name__ == "__main__":
    main()