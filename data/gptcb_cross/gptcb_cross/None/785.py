n = 0
print("Enter an integer number: ")
n = int(input())
if n <= 0: 
    print("Enter numbers greater than 0")
else: 
    a = NumberToWord()
    print("After conversion number in words is: ")
    a.pw(int(n/1000000000)," Hundred")
    a.pw(int(n/10000000)%100, "crore")
    a.pw(int((n/100000)%100), "lakh")
    a.pw(int((n/1000)%100), "thousand")
    a.pw(int((n/100)%10), "hundred")
    a.pw(int(n%100), "")
