public static String shuffle (String s) {

    String shuffledString = "";

    while (s.length () != 0) {

        int index = (int) Math.floor ();

        char c = s.charAt (index);

        s = s.substring (0, index) + s.substring (index + 1);

        shuffledString += c;

    }

    return shuffledString;

}
