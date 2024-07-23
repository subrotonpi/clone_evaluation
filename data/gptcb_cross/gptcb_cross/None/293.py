def main():
    array = [1, 2, 3, 3, 2, 2, 4, 4, 5, 4]
    counts = {}
    for i in array:
        if i not in counts:
            counts[i] = 1
        else:
            counts[i] += 1
    cs = list(counts.values())
    cs.sort()
    minVal = cs[0]
    minElements = []
    for key, value in counts.items():
        if value == minVal:
            minElements.append(key)
    for i in minElements:
        print("Element: ", i, "Number of occurences: ", minVal)

if __name__ == '__main__':
    main()