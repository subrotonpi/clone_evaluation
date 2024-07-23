public static Boolean isAnagram (String word, String anagram_word) {

    if (word.length () != anagram_word.length ()) {

        return false;

    }

    char [] words_char = word.toCharArray ();

    char [] anagram_word_char = anagram_word.toCharArray ();

    int X1 = 1;

    int anagram_word_num = 1;

    Map < Character, Integer > wordPrimeMap = wordPrimeMap ();

    for (int i = 0;

    i < words_char.length; i ++) {

        X1 *= wordPrimeMap.get (words_char [i]);

    }

    for (int i = 0;

    i < anagram_word_char.length; i ++) {

        anagram_word_num *= wordPrimeMap.get (anagram_word_char [i]);

    }

    return anagram_word_num == X1;

}
