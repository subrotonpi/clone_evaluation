public static void main (String [] args) {

    List < List < Integer > > twoDim = new ArrayList < List < Integer > > ();

    String [] inputLines = {"0 1 0 1 0", "0 1 1 0 1", "0 0 0 1 0"};

    for (String line : inputLines) {

        List < Integer > row = new ArrayList < Integer > ();

        Scanner s = new Scanner (line);
 // EOL Comment
        while (s.hasNextInt ()) row.add (s.nextInt ());

        twoDim.add (row);

    }

}
