public static String camelCaser (String str) {

    char [] X1 = str.toCharArray ();

    X1 [0] = Character.toUpperCase (X1 [0]);

    for (int i = 0;

    i < X1.length; i ++) if (X1 [i] == '_') X1 [i + 1] = Character.toUpperCase (X1 [i + 1]);

    String reply = new String (X1);

    reply = reply.replace ("_", "");

    return reply;

}
