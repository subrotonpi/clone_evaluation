public static void main (String [] args) {

    String stmt = " INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb),(b',ccc),(aaa,bbb,ccc); ";

    System.out.printf ("%s\n", stmt);

    stmt = stmt.split ("(?i)\\s+values\\s*\\(|\\);") [1];

    System.out.printf ("values list: %s\n", stmt);

    Matcher m = Pattern.compile ("('\\w*)(\\)\\,\\()+(\\w*')").matcher (stmt);

    while (m.find ()) {

        stmt = stmt.substring (0, m.start (2)) + "###" + stmt.substring (m.end (2), stmt.length ());

        System.out.printf ("values list with pattern subst inside char literal: %s\n", stmt);

    }

    String [] multiValues = stmt.split ("\\)\\,\\(");

    for (int i = 0;

    i < multiValues.length; i ++) {

        multiValues [i] = multiValues [i].replaceAll ("###", "),(");

    }

    System.out.println (Arrays.toString (multiValues));

}