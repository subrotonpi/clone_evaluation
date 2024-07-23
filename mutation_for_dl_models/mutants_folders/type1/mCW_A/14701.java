public static String replace (String old, String newWord, String input) {

    int i = input.indexOf (old);

    if (i < 0) {

        return input;

    }

    String partBefore = input.substring (0, i);

    String partAfter = input.substring (i + old.length ()); 

    return partBefore + newWord + replace (old, newWord, partAfter);

}
