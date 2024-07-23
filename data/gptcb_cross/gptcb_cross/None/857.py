name = "AnuvratAnuvra"
arr = list(name)
map = {}
for i in range(len(arr)):
    if arr[i] in map:
        map[arr[i]] += 1
    else:
        map[arr[i]] = 1
for key in map.keys():
    if map[key] > 1:
        print(key + ":" + str(map[key])) 
