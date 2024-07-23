public static void main (String [] args) {

    List < List < Integer > > twoDim = new ArrayList < List < Integer > > ();

    String [] inputLines = {"0 1 0 1 0", "0 1 1 0 1", "0 0 0 1 0"};

    for (String line : inputLines) {

        List < Integer > row = new ArrayList < Integer > ();

        Scanner X1 = new Scanner (line);

        while (X1.hasNextInt ()) row.add (X1.nextInt ());

        twoDim.add (row);

    }

}
