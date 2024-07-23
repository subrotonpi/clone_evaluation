list1 = [Cat, Mouse, Dog]
list2 = [Dog, Mouse, Cat]
list3 = [Dog, Horse, Cat]
list4 = [Dog, Tiger, Lion]
lists = [list1, list2, list3, list4]
sorted_list = set()
for animals in lists:
  arList = list(animals)
  arList.sort()
  sorted_list.add(arList)
 
for animals in sorted_list:
  print(animals)
  
