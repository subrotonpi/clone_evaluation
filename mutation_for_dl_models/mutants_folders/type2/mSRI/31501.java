public static void main (String [] args) {

    try {

        String input = "";

        char X1 = (char) System.in.read ();

        while (X1 != '\n') {

            input += X1;

            X1 = (char) System.in.read ();

        }

        System.out.println (input);

    } catch (Exception e) {

        System.out.println (e);

    }

}
