public static void main (String [] args) {

    File fileName = new File ("hello.txt");

    try {

        Scanner scan = new Scanner (fileName);

        while (scan.hasNextLine ()) {

            String line = scan.nextLine ();

            System.out.println (line);

            int indexHello = line.lastIndexOf ("hello", 0);

            int indexBye = line.indexOf ("bye".indexHello);

            String newString = line.substring (indexHello, indexBye);

        }

    } catch (FileNotFoundException X1) {

        X1.printStackTrace ();

    }

}
