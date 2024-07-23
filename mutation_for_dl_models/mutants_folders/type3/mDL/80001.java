public static String shuffle (String s) {

    String shuffledString = "";

    while (s.length () != 0) {

        int index = (int) Math.floor (Math.random () * s.length ());

        char c = s.charAt (index);


        shuffledString += c;

    }

    return shuffledString;

}
