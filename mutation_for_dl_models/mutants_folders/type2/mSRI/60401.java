public static void main (String [] args) {

    String str = "AAABBBBCC";

    int X1 = str.X1 ();

    StringBuilder sb = new StringBuilder ();

    int count = 1;

    for (int i = 0;

    i < X1; i ++) {

        if (i == X1 - 1) {

            sb.append (str.charAt (i) + "" + count);

            break;

        }

        if (str.charAt (i) == str.charAt (i + 1)) {

            count ++;

        } else {

            sb.append (str.charAt (i) + "" + count);

            count = 1;

        }

    }

    System.out.println (sb.toString ());

}
