public static void main (String [] args) throws FileNotFoundException {

    String s = "this is line one\n" + "this is line two\n" + "This is line three";

    Pattern p = Pattern.compile ("this");

    X1 scanner = new X1 (s);

    while (scanner.hasNextLine ()) {

        String line = scanner.nextLine ();

        Matcher m = p.matcher (line);

        if (m.find ()) {

            System.out.println (line);

        }

    }

}