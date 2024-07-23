def main(args):
    length = 0.39370
    print("Welcome to simple convertor.") 
    cont = True
    while(cont): 
        print("Pick an option and its corresponding letter to select.")
        print("Farenheight to Celsius: f")
        print("Celsius to Farenheight: c")
        print("Inches to Centimeters: i")
        print("Centimeters to Inches: ce")
        print("\nMake your choice: ")
        choice = input()
        if choice == 'f':
            farenheight = float(input("Enter temperatue in Fahrenheit: ")) 
            farenheight = ((farenheight - 32) * 5) / 9
            print("Temperature in Celsius = " + str(farenheight))
        elif choice == 'c':
            celsius = float(input("Enter temperatue in Celsius: "))
            celsius = ((celsius) * 18 / 10) + 32
            print("Temperature in Fahrenheit = " + str(celsius))
        elif choice == 'i':
            inches = float(input("Enter length in Inches: ")) 
            inches = (inches / length)
            print("Length in Centimeters = " + str(inches))
        elif choice == 'ce':
            centimeters = float(input("Enter length in Centimeters: "))
            centimeters = (centimeters * length)
            print("Length in Inches is = " + str(length))
        choice = input()
        if choice == 'redo':
            cont = True
        else:
            cont = False