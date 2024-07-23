public static String shuffle (String s) {

    String shuffledString = "";

    while (s.length () != 0) {

        int index = (int) Math.floor (Math.random () * s.length ());

        char X1 = s.charAt (index);

        s = s.substring (0, index) + s.substring (index + 1);

        shuffledString += X1;

    }

    return shuffledString;

}
