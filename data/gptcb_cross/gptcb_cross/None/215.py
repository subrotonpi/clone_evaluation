def main():
    first = int(input("Enter first integer: "))
    print("You have keyed in", first)

    second = int(input("Enter second integer: "))
    print("You have keyed in", second)

    random_number = random.randint(first, second)
    print("Random number:",  random_number)

if __name__ == "__main__":
    main()