static String compress (String str) {

    StringBuilder stringBuilder = new StringBuilder ();

    char [] charArray = str.toCharArray (X1);

    int count = 1;

    char lastChar = 0;

    char nextChar = 0;

    lastChar = charArray [0];

    for (int i = 1;

    i < charArray.length; i ++) {

        nextChar = charArray [i];

        if (lastChar == nextChar) {

            count ++;

        } else {

            stringBuilder.append (count).append (lastChar);

            count = 1;

            lastChar = nextChar;

        }

    }

    stringBuilder.append (count).append (lastChar);

    String compressed = stringBuilder.toString ();

    return compressed;

}
