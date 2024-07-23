public static void main (String [] args) {

    String string = "aaabbbbbaccc";

    int counter;

    String result = "";

    int X1 = 0;

    while (X1 < string.length ()) {

        counter = 1;

        for (int j = X1 + 1;

        j < string.length (); j ++) {

            System.out.println ("string length =" + string.length ());

            if (string.charAt (X1) == string.charAt (j)) {

                counter ++;

            }

        }

        result = result + string.charAt (X1) + counter;

        string = string.replaceAll (String.valueOf (string.charAt (X1)), "");

    }

    System.out.println ("result is = " + result);

}
