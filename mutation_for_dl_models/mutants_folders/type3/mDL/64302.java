public static String join (Object [] objects, String delimiter) {

    if (objects.length == 0) {

        return "";

    }

    int capacityGuess = (objects.length * objects [0].toString ().length ()) + ((objects.length - 1) * delimiter.length ());

    StringBuilder ret = new StringBuilder (capacityGuess);


    for (int i = 1;

    i < objects.length; i ++) {

        ret.append (delimiter);

        ret.append (objects [i]);

    }

    return ret.toString ();

}
