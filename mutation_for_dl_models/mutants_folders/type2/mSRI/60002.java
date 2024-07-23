public static void main (String [] args) {

    String str = "AAABBBBCC";

    int length = str.length ();

    StringBuilder sb = new StringBuilder ();

    int X1 = 1;

    for (int i = 0;

    i < length; i ++) {

        if (i == length - 1) {

            sb.append (str.charAt (i) + "" + X1);

            break;

        }

        if (str.charAt (i) == str.charAt (i + 1)) {

            X1 ++;

        } else {

            sb.append (str.charAt (i) + "" + X1);

            X1 = 1;

        }

    }

    System.out.println (sb.toString ());

}
