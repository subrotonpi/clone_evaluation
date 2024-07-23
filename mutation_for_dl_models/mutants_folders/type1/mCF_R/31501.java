public static void main (String [] args) {

    try {

        String input = "";

        char c = (char) System.in.read ();

        while (c != '\n') {

            input += c;

            c = (char) System.in.read ();

        }

        System.out.println (input);

    } catch (Exception e) {

        System.out.println (e);

    }
 }
