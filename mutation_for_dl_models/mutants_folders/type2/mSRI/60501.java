public static void main (String [] args) {

    String str = "AAABBBBCC";

    int length = str.length ();

    StringBuilder X1 = new StringBuilder ();

    int count = 1;

    for (int i = 0;

    i < length; i ++) {

        if (i == length - 1) {

            X1.append (str.charAt (i) + "" + count);

            break;

        }

        if (str.charAt (i) == str.charAt (i + 1)) {

            count ++;

        } else {

            X1.append (str.charAt (i) + "" + count);

            count = 1;

        }

    }

    System.out.println (X1.toString ());

}
