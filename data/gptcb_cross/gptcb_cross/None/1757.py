def main (*args):
    processor = DefaultProcessor ()
    values = [0, 4, 10, 12, 100, 108, 299, 1000, 1003, 2040, 45213, 100000, 100005, 100010, 202020, 202022, 999999, 1000000, 1000001, 10000000, 10000007, 99999999, Long.MAX_VALUE, Long.MIN_VALUE]
    str_values = ["0", "1.30", "0001.00", "3.141592"]
    for val in values:
        print (str (val) + " = " + processor.getName (val))
    for str_val in str_values:
        print (str_val + " = " + processor.getName (str_val))
    big_number = ""
    for d in range (0, 66):
        big_number += str (int (random.uniform (0, 10)))
    big_number += "."
    for d in range (0, 26):