def main():
    array_size = int(input('Enter Size of the array: '))
    container = []
    for _ in range(array_size):
        container.append(int(input('enter a element:')))
    container.sort()
    res = []
    res.append(container[0])
    for i in range(1, array_size):
        if container[i] != container[i - 1]:
            res.append(container[i])
    print(res)

if __name__ == '__main__':
    main()