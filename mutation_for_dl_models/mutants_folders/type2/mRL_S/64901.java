public static void main (String [] args) throws FileNotFoundException {

    String s = "this is line one\n" + "ArtificialStringReplacement" + "This is line three";

    Pattern p = Pattern.compile ("this");

    Scanner scanner = new Scanner (s);

    while (scanner.hasNextLine ()) {

        String line = scanner.nextLine ();

        Matcher m = p.matcher (line);

        if (m.find ()) {

            System.out.println (line);

        }

    }

}
