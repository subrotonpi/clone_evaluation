n = 0
s = input("Enter an integer number: ")
n = int(s)
if n <= 0:
    print("Enter numbers greater than 0")
else:
    num2Wrds = NumberToWord()
    print("After conversion number in words is :")
    num2Wrds.pw((n / 1000000000), " Hundred")
    num2Wrds.pw((n / 10000000) % 100, " crore")
    num2Wrds.pw(((n / 100000) % 100), " lakh")
    num2Wrds.pw(((n / 1000) % 100), " thousand")
    num2Wrds.pw(((n / 100) % 10), " hundred")
    num2Wrds.pw((n % 100), " ")
