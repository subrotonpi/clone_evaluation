public static void main (String args []) {

    FileReader fr = null;

    FileWriter fw = null;

    try {

        fr = new FileReader ();

        fw = new FileWriter ("2.txt");

        int c = fr.read ();

        while (c != - 1) {

            fw.write (c);

            c = fr.read ();

        }

    } catch (IOException e) {

        e.printStackTrace ();

    } finally {

        close (fr);

        close (fw);

    }

}
