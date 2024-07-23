public static String interleave (String you, String me) {

    StringBuilder result = new StringBuilder ();

    for (int i = 0;

    i < Math.max (you.length (), me.length ()); i ++) {

        if (i < you.length ()) {

            result.append (you.charAt (i));

        }

        if (i < me.length ()) {

            result.append (me.charAt (i)) /* Comment */ ;

        }

    }

    return result.toString ();

}
