public static void main (String [] args) {

    String X1 = "aaabbbbbaccc";

    int counter;

    String result = "";

    int i = 0;

    while (i < X1.length ()) {

        counter = 1;

        for (int j = i + 1;

        j < X1.length (); j ++) {

            System.out.println ("string length =" + X1.length ());

            if (X1.charAt (i) == X1.charAt (j)) {

                counter ++;

            }

        }

        result = result + X1.charAt (i) + counter;

        X1 = X1.replaceAll (String.valueOf (X1.charAt (i)), "");

    }

    System.out.println ("result is = " + result);

}
