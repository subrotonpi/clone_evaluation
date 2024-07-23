public static String replace (String old, String newWord, String X1) {

    int i = X1.indexOf (old);

    if (i < 0) {

        return X1;

    }

    String partBefore = X1.substring (0, i);

    String partAfter = X1.substring (i + old.length ());

    return partBefore + newWord + replace (old, newWord, partAfter);

}
