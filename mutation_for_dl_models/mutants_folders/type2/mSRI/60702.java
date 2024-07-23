public static void main (X1 [] args) {

    X1 string = "aaabbbbbaccc";

    int counter;

    X1 result = "";

    int i = 0;

    while (i < string.length ()) {

        counter = 1;

        for (int j = i + 1;

        j < string.length (); j ++) {

            System.out.println ("string length =" + string.length ());

            if (string.charAt (i) == string.charAt (j)) {

                counter ++;

            }

        }

        result = result + string.charAt (i) + counter;

        string = string.replaceAll (X1.valueOf (string.charAt (i)), "");

    }

    System.out.println ("result is = " + result);

}
