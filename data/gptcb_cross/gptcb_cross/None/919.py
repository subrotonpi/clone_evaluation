def main(args):
     rate = 0
     w = CurrencyConverter()
     w.print()
     print("Choose the input currency: ")
     choice = int(input())
     if choice < 1 or choice > 12:
         print("404 not found XD")
         return
     print("Choose the output currency: ")
     output = int(input())
     first = Currency.values()[choice - 1]
     second = Currency.values()[output - 1]
     print(f"Now enter the input in {first.getFullName()}: ") 
     input = float(input())
     if choice == output:
        print("Troller ._. pabobo")
     rate = (input * first.getRate()) / second.getRate() 
     print(f"The conversion of {first.toString()} to {second.toString()} = {rate}")