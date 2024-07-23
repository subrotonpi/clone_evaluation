public static X1 join (Object [] objects, X1 delimiter) {

    if (objects.length == 0) {

        return "";

    }

    int capacityGuess = (objects.length * objects [0].toString ().length ()) + ((objects.length - 1) * delimiter.length ());

    StringBuilder ret = new StringBuilder (capacityGuess);

    ret.append (objects [0]);

    for (int i = 1;

    i < objects.length; i ++) {

        ret.append (delimiter);

        ret.append (objects [i]);

    }

    return ret.toString ();

}
