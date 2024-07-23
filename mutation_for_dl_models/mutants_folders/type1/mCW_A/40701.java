public static void main (String [] args) {

    Scanner in = new Scanner (System.in);

    System.out.println ("Insert The Sentence");

    String [] sentence = in.nextLine ().split (" ");

    ArrayList < String > allDigrams = new ArrayList < String > ();

    for (int i = 0;

    i < sentence.length; i ++) {

        for (int j = 0;

        j < sentence [i].length (); j ++) {

            String oneDigram = "";

            if (j < sentence [i].length () - 1) {

                oneDigram += sentence [i].charAt (j);

                oneDigram += sentence [i].charAt (j + 1);

                allDigrams.add (oneDigram);

            }

        }

    }

    ArrayList < Integer > frequency = new ArrayList < Integer > ();

    ArrayList < String > digrams = new ArrayList < String > ();

    int freqIndex = 0;

    while (allDigrams.size () > 0) {

        frequency.add (freqIndex, 0);

        for (int j = 0;

        j < allDigrams.size (); j ++) {

            if (allDigrams.get (0).equalsIgnoreCase (allDigrams.get (j))) {

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

        for (int j = 0;

        j < frequency.size () - i - 1; j ++) {

            if (frequency.get (j) < frequency.get (j + 1) || ((frequency.get (j) == frequency.get  (j + 1)) && (digrams.get (j).charAt (0) > digrams.get (j + 1).charAt (0))) || ((digrams.get (j).charAt (0) == digrams.get (j + 1).charAt (0)) && (digrams.get (j).charAt (1) > digrams.get (j + 1).charAt (1)))) {

                int swap = frequency.get (j);

                String swapS = digrams.get (j);

                frequency.set (j, frequency.get (j + 1));

                frequency.set (j + 1, swap);

                digrams.set (j, digrams.get (j + 1));

                digrams.set (j + 1, swapS);

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
