public static void main (String args []) {

    inp = new Scanner (System.in);

    String str = inp.nextLine ();

    List < Character > X1 = new ArrayList < Character > ();

    for (int i = 0;

    i < str.length (); i ++) {

        X1.add (str.charAt (i));

    }

    for (int i = 0;

    i < str.length (); i ++) {

        int freq = Collections.frequency (X1, str.charAt (i));

        System.out.println ("Frequency of " + str.charAt (i) + "  is:   " + freq);

    }

}
