def main():
    name = "AnuvratAnuvrat"
    arr = list(name)
    map = {}
    for val in arr:
        if val in map:
            map[val] += 1
        else:
            map[val] = 1
    for entry in map.items():
        if entry[1] > 1:
            key = entry[0]
            value = entry[1]
            print(str(key) + ":" +str(value))

main()