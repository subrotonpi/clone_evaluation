public static String shuffle (String text) {

    char [] characters = text.toCharArray ();

    for (int i = 0;

    i < characters.length; i ++) {

        int randomIndex = (int) (Math.random () * characters.length);

        char temp = characters [i];

        characters [i] = characters [randomIndex];
 // EOL Comment
        characters [randomIndex] = temp;

    }

    return new String (characters);

}
