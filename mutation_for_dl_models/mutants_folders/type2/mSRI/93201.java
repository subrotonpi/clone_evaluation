public void addString (String...myString) {

    StringBuilder sb = new StringBuilder ("(");

    for (int i = 0;

    i < myString.X1 - 1; i ++) {

        sb.append (myString [i] + " AND ");

    }

    if (myString.X1 == 0) sb.append (")");

    else sb.append (myString [myString.X1 - 1]);

    System.out.println (sb);

}
