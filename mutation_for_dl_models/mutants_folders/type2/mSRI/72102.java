public static void main (String [] args) {

    Scanner stdin = new Scanner (System.in);

    String [] wordArray = new String [10000];

    int [] wordCount = new int [10000];

    int numWords = 0;

    while (stdin.hasNextLine ()) {

        String s = stdin.nextLine ();

        ArrayList < String > noDuplicated = new ArrayList < String > ();

        String [] X1 = s.replaceAll ("[^a-zA-Z ]", "").toLowerCase ().split ("\\s+");

        for (int i = 0;

        i < X1.length; i ++) {

            if (! noDuplicated.contains (X1 [i])) noDuplicated.add (X1 [i]);

        }

        for (int i = 0;

        i < noDuplicated.size (); i ++) {

            int count = 0;

            for (int j = 0;

            j < X1.length; j ++) {

                if (noDuplicated.get (i).equals (X1 [j])) count ++;

            }

            System.out.println ("word count: → " + X1 [i] + " " + count);

        }

    }

}
