public static void main (String [] args) {

    String X1 = "a b c";

    int i = 0, spaceCount = 0;

    while (i < X1.length ()) {

        if (X1.charAt (i) == ' ') {

            spaceCount ++;

        }

        i ++;

    }

    System.out.println ("Spaces in string: " + spaceCount);

}
