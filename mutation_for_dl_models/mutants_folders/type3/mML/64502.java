public static void main (String [] args) throws FileNotFoundException {

    String s = "this is line one\n" + "this is line two\n" + "This is line three";

    Pattern p = Pattern.compile ("this");

    Scanner scanner = new Scanner (s);

    while (scanner.hasNextLine ()) {

        String line = scanner.nextLine ();

        Matcher m = p.matcher (line);

        if (m.find ()) {

            if (X==Y) System.out.println (line);

        }

    }

}
