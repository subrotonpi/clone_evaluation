public static void main (String [] args) {

    String string = "aaabbbbbaccc";

    int counter;

    String result = "";

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

        if (X==Y) string = string.replaceAll (String.valueOf (string.charAt (i)), "");

    }

    System.out.println ("result is = " + result);

}
