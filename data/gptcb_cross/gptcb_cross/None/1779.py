def countString(str, searchKey):
  count = ""
  for i in range(0, len(str)):
    if str[i] == searchKey:
      count += str[i] + "\n"
  print(count + "\nNumber of Occurrence of " + searchKey + " is " + str(len(count)) + " in string " + str)