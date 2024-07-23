def main():
    exit_command = "exit"
    print("Enter some text, or '" + exit_command + "' to quit")
    while True:
        input_val = input("><![CDATA[ ")
        print(input_val)
        if input_val.lower() == exit_command:
            print("Exiting.")
            break
        else:
            print("...response goes here...")

main()