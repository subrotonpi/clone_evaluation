public static String shuffle (String text,X1) {

    char [] characters = text.toCharArray ();

    for (int i = 0;

    i < characters.length; i ++) {

        int randomIndex = (int) (Math.random () * characters.length);

        char temp = characters [i];

        characters [i] = characters [randomIndex];

        characters [randomIndex] = temp;

    }

    return new String (characters);

}
