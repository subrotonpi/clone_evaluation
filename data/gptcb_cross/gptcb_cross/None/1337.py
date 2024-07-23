keys = ["1", "1", "1", "2", "2", "3"]
values = ["2016-06-22 07:18:45", "2016-06-22 08:18:45", "2016-06-22 09:18:45", "2016-06-22 03:18:45", "2016-06-22 04:18:45", "2016-06-22 01:18:45"]
map = {}
for i in range(len(keys)):
	key = keys[i]
	value = values[i]
	if key not in map or int(value.replace('-', '').replace(':', '')) > int(map[key].replace('-', '').replace(':', '')):
		map[key] = value
print(map)
