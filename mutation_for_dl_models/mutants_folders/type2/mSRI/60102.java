public static void main (String args []) {

    inp = new Scanner (System.in);

    String str = inp.nextLine ();

    List < Character > arrlist = new ArrayList < Character > ();

    for (int X1 = 0;

    X1 < str.length (); X1 ++) {

        arrlist.add (str.charAt (X1));

    }

    for (int X1 = 0;

    X1 < str.length (); X1 ++) {

        int freq = Collections.frequency (arrlist, str.charAt (X1));

        System.out.println ("Frequency of " + str.charAt (X1) + "  is:   " + freq);

    }

}
