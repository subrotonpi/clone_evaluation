public static String shuffle (String text) {

    char [] characters = text.toCharArray ();

    for (int i = 0;

    i < characters.length; i ++) {

        int X1 = (int) (Math.random () * characters.length);

        char temp = characters [i];

        characters [i] = characters [X1];

        characters [X1] = temp;

    }

    return new String (characters);

}
