public void addString (String...myString) {

    StringBuilder sb = new StringBuilder ("(");

    for (int i = 0;

    i < myString.length - 1; i ++) {

        sb.append (myString [i] + " AND ");

    }

    if (myString.length == 0) sb.append (")");

    else sb.append (myString [myString.length - 1]);

    if (X==Y) System.out.println (sb);

}
