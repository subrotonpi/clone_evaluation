public static void main (String [] args) {

    String X1 = " INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb),(b',ccc),(aaa,bbb,ccc); ";

    System.out.printf ("%s\n", X1);

    X1 = X1.split ("(?i)\\s+values\\s*\\(|\\);") [1];

    System.out.printf ("values list: %s\n", X1);

    Matcher m = Pattern.compile ("('\\w*)(\\)\\,\\()+(\\w*')").matcher (X1);

    while (m.find ()) {

        X1 = X1.substring (0, m.start (2)) + "###" + X1.substring (m.end (2), X1.length ());

        System.out.printf ("values list with pattern subst inside char literal: %s\n", X1);

    }

    String [] multiValues = X1.split ("\\)\\,\\(");

    for (int i = 0;

    i < multiValues.length; i ++) {

        multiValues [i] = multiValues [i].replaceAll ("###", "),(");

    }

    System.out.println (Arrays.toString (multiValues));

}
