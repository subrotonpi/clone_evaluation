public static String interleave (String you, String me) {

    StringBuilder X1 = new StringBuilder ();

    for (int i = 0;

    i < Math.max (you.length (), me.length ()); i ++) {

        if (i < you.length ()) {

            X1.append (you.charAt (i));

        }

        if (i < me.length ()) {

            X1.append (me.charAt (i));

        }

    }

    return X1.toString ();

}
