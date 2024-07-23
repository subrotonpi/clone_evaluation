def main():
    number = input('Enter a number: ')
    total = 0
    even = False
    for digit in number:
        a = int(digit)
        if a % 2 != 0 or a == 1:
            even = False
            total += a
    print ("The sum is " + str(total))