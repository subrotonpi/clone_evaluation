def isAnagram(word, anagram_word):
    if len(word) != len(anagram_word):
        return False
    
    words_char = list(word)
    anagram_word_char = list(anagram_word)
    words_char_num = 1
    anagram_word_num = 1
    wordPrimeMap = getWordPrimeMap()
    
    for i in range(len(words_char)):
        words_char_num *= wordPrimeMap.get(words_char[i])
    for i in range(len(anagram_word_char)):
        anagram_word_num *= wordPrimeMap.get(anagram_word_char[i])
    
    return anagram_word_num == words_char_num