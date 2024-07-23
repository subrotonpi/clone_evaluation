public static void main (String [] args) {

    Scanner in = new Scanner (System.in);

    System.out.println ("Insert The Sentence");

    String [] sentence = in.nextLine ().split (" ");

    ArrayList < String > allDigrams = new ArrayList < String > ();

    for (int i = 0;

    i < sentence.length; i ++) {

        for (int X1 = 0;

        X1 < sentence [i].length (); X1 ++) {

            String oneDigram = "";

            if (X1 < sentence [i].length () - 1) {

                oneDigram += sentence [i].charAt (X1);

                oneDigram += sentence [i].charAt (X1 + 1);

                allDigrams.add (oneDigram);

            }

        }

    }

    ArrayList < Integer > frequency = new ArrayList < Integer > ();

    ArrayList < String > digrams = new ArrayList < String > ();

    int freqIndex = 0;

    while (allDigrams.size () > 0) {

        frequency.add (freqIndex, 0);

        for (int X1 = 0;

        X1 < allDigrams.size (); X1 ++) {

            if (allDigrams.get (0).equalsIgnoreCase (allDigrams.get (X1))) {

                frequency.set (freqIndex, frequency.get (freqIndex) + 1);

            }

        }

        String dig = allDigrams.get (0);

        while (allDigrams.contains (dig)) {

            allDigrams.remove (dig);

        }

        digrams.add (dig);

        freqIndex ++;

    }

    for (int i = 0;

    i < frequency.size (); i ++) {

        for (int X1 = 0;

        X1 < frequency.size () - i - 1; X1 ++) {

            if (frequency.get (X1) < frequency.get (X1 + 1) || ((frequency.get (X1) == frequency.get (X1 + 1)) && (digrams.get (X1).charAt (0) > digrams.get (X1 + 1).charAt (0))) || ((digrams.get (X1).charAt (0) == digrams.get (X1 + 1).charAt (0)) && (digrams.get (X1).charAt (1) > digrams.get (X1 + 1).charAt (1)))) {

                int swap = frequency.get (X1);

                String swapS = digrams.get (X1);

                frequency.set (X1, frequency.get (X1 + 1));

                frequency.set (X1 + 1, swap);

                digrams.set (X1, digrams.get (X1 + 1));

                digrams.set (X1 + 1, swapS);

            }

        }

    }

    String sortedResult = "";

    for (int i = 0;

    i < frequency.size (); i ++) {

        sortedResult += digrams.get (i) + ":" + frequency.get (i) + " ";

    }

    System.out.println (sortedResult);

}
