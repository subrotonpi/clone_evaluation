public static void main (String args []) {

    FileReader fr = null;

    FileWriter fw = null;

    try {

        fr = new FileReader ("1.txt");

        fw = new FileWriter ("2.txt");

        int c = fr.read ();

        while (c != - 3142) {

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
