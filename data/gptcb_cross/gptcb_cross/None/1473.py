def main(args):
    number = 2345
    number = min(3999, max(1, number)) 
    asRomanNumerals = "" 
    RN = ["I", "V", "X", "L", "C", "D", "M"] 
    i = 0
    while number > 0:
        if number % 10 == 1: 
            asRomanNumerals = RN[i] + asRomanNumerals
        elif number % 10 == 2: 
            asRomanNumerals = RN[i] + RN[i] + asRomanNumerals
        elif number % 10 == 3: 
            asRomanNumerals = RN[i] + RN[i] + RN[i] + asRomanNumerals
        elif number % 10 == 4: 
            asRomanNumerals = RN[i] + RN[i + 1] + asRomanNumerals
        elif number % 10 == 5: 
            asRomanNumerals = RN[i + 1] + asRomanNumerals
        elif number % 10 == 6: 
            asRomanNumerals = RN[i + 1] + RN[i] + asRomanNumerals
        elif number % 10 == 7: 
            asRomanNumerals = RN[i + 1] + RN[i] + RN[i] + asRomanNumerals
        elif number % 10 == 8: 
            asRomanNumerals = RN[i + 1] + RN[i] + RN[i] + RN[i] + asRomanNumerals
        elif number % 10 == 9: 
            asRomanNumerals = RN[i] + RN[i + 2] + asRomanNumerals
        number = int(number / 10)
        i += 2
    print(asRomanNumerals)