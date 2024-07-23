public static String shuffle (String text) {

    char [] X1 = text.toCharArray ();

    for (int i = 0;

    i < X1.length; i ++) {

        int randomIndex = (int) (Math.random () * X1.length);

        char temp = X1 [i];

        X1 [i] = X1 [randomIndex];

        X1 [randomIndex] = temp;

    }

    return new String (X1);

}
