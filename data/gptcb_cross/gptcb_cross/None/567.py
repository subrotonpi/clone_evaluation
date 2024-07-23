def main(args):
    print("Hello World")
    xyz = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    mid = (len(xyz) + 1) // 2
    spstr = [xyz[0:mid], xyz[mid:]]
    first_mix = spstr[1] + spstr[0]
    array = list(first_mix)
    for i in range(1,3):
        temp = array[i]
        array[i] = array[len(array) - i]
        array[len(array) - i] = temp
    str1 = ''.join(array)
    j = 2
    for i in range(len(array) // 2 - 2, len(array) // 2):
        temp = array[i]
        array[i] = array[len(array) // 2 + j]
        array[len(array) // 2 + j] = temp
        j -= 1
    str2 = ''.join(array)
    print(first_mix)
    print(str1)
    print(str2)

if __name__ == '__main__':
    main(sys.argv)