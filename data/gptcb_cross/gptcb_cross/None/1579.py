def main():
    scan = input("Please enter the red color. Range [0, 255] only please: ")
    red = int(scan)
    scan = input("Please enter the green color. Range [0, 255] only please: ")
    green = int(scan)
    scan = input("Please enter the blue color. Range [0, 255] only please: ")
    blue = int(scan)

    # Create code
    code = 0
    code += red * 2**16
    code += green * 2**8
    code += blue * 2**0

    print("The code is " + str(code) + ".")

    # Extract values from code
    red = int(code >> 16)
    green = int((code & 0xFF00) >> 8)
    blue = int(code & 0xFF)

    print("Your red value is: " + str(red))
    print("Your green value is: " + str(green))
    print("Your blue value is: " + str(blue))

if __name__ == "__main__":
    main()