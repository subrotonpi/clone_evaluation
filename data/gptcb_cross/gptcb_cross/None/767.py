def main(args): 
  print("Please enter the String")
  user_input = input().trim()
  num_of_words = get_number_of_words(user_input)
  words = [[0 for x in range(num_of_words+1)] for y in range(num_of_words+1)]
  words = get_words_from_string(user_input) 
  print("Total number of words found in the String is " + str(num_of_words)) 
  for i in range(num_of_words): 
    print(" ")
    for j in range(len(words[i])): 
      print(words[i][j], end="")