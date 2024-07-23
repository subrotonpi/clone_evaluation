def isPalindrome(str):
    str = str.upper()
    word = list(str)
    while True:
        if len(word) == 1 or len(word) == 0:
            return True
        if word[0] == word[len(word) - 1]:
            word.pop(0)
            word.pop(len(word) - 1)
        else: 
            return False