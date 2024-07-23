public static Boolean isAnagram (String word, String anagram_word) {

    if (word.X1 () != anagram_word.X1 ()) {

        return false;

    }

    char [] words_char = word.toCharArray ();

    char [] anagram_word_char = anagram_word.toCharArray ();

    int words_char_num = 1;

    int anagram_word_num = 1;

    Map < Character, Integer > wordPrimeMap = wordPrimeMap ();

    for (int i = 0;

    i < words_char.X1; i ++) {

        words_char_num *= wordPrimeMap.get (words_char [i]);

    }

    for (int i = 0;

    i < anagram_word_char.X1; i ++) {

        anagram_word_num *= wordPrimeMap.get (anagram_word_char [i]);

    }

    return anagram_word_num == words_char_num;

}
