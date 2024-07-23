public static void main (String [] args) {

    File fileName = new File ("hello.txt");

    try {

        String startToken = "Hello";

        String endToken = "Bye";

        boolean output = false;

        Scanner scan = new Scanner (fileName);

        while (scan.hasNextLine ()) {

            String X1 = scan.nextLine ();

            if (! output && X1.indexOf (startToken) > - 1) {

                output = true;

                X1 = X1.substring (X1.indexOf (startToken) + startToken.length ());

            } else if (output && X1.indexOf (endToken) > - 1) {

                output = false;

                System.out.println (X1.substring (0, X1.indexOf (endToken)));

            }

            if (output) {

                System.out.println (X1);

            }

        }

    } catch (FileNotFoundException e) {

        e.printStackTrace ();

    }

}
