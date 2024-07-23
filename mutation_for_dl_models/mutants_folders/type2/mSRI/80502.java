public static String shuffle (String text) {

    char [] characters = text.toCharArray ();

    for (int X1 = 0;

    X1 < characters.length; X1 ++) {

        int randomIndex = (int) (Math.random () * characters.length);

        char temp = characters [X1];

        characters [X1] = characters [randomIndex];

        characters [randomIndex] = temp;

    }

    return new String (characters);

}
