def main():
    number1 = "108"
    number2 = "84"
    n1 = list(map(int, number1))
    n2 = list(map(int, number2))
    result = 0
    for i in range(len(n1)):
        for j in range(len(n2)):
            result += n1[i] * n2[j] * (10 ** (len(n1) + len(n2) - (i + j + 2)))
    print(result)

if __name__ == "__main__":
    main()