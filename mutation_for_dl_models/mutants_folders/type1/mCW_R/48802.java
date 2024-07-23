public static void main (String [] args) {

    File fileName =new File ("hello.txt");

    try {

        String startToken = "Hello";

        String endToken = "Bye";

        boolean output = false;

        Scanner scan = new Scanner (fileName);

        while (scan.hasNextLine ()) {

            String line = scan.nextLine ();

            if (! output && line.indexOf (startToken) > - 1) {

                output = true;

                line = line.substring (line.indexOf (startToken) + startToken.length ());

            } else if (output && line.indexOf (endToken) > - 1) {

                output = false;

                System.out.println (line.substring (0, line.indexOf (endToken)));

            }

            if (output) {

                System.out.println (line);

            }

        }

    } catch (FileNotFoundException e) {

        e.printStackTrace ();

    }

}
