def main():
    processor = DefaultProcessor()
    values = [0, 4, 10, 12, 100, 108, 299, 1000, 1003, 2040, 45213, 100000, 100005, 100010, 202020, 202022, 999999, 1000000, 1000001, 10000000, 10000007, 99999999, Long.MAX_VALUE, Long.MIN_VALUE]
    strValues = ["0", "1.30", "0001.00", "3.141592"]
    for val in values:
        print(str(val) + " = " + processor.getName(val))
    for strVal in strValues:
        print(strVal + " = " + processor.getName(strVal))
    bigNumber = ''
    for d in range(66):
        bigNumber += chr(random.randint(0,10) + ord('0'))
    bigNumber += '.'
    for d in range(26):
        bigNumber += chr(random.randint(0,10) + ord('0'))
    print(bigNumber + " = " + processor.getName(bigNumber))