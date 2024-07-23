def main(args):
    print("Enter some text, or '" + exit_command + "' to quit")
    while True:
        input = input("><![CDATA[ ")
        print(input)
        if len(input) == len(exit_command) and input.lower() == exit_command:
            print("Exiting.")
            sys.exit()
        print("...response goes here...")

if __name__ == '__main__':
    main(sys.argv)