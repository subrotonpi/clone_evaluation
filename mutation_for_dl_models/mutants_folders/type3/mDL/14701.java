public static String replace (String old, String newWord, String input) {

    int i = input.indexOf (old);

    if (i < 0) {

        return input;

    }

    String partBefore = input.substring (0, i);


    return partBefore + newWord + replace (old, newWord, partAfter);

}
