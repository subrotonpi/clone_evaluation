public static void main (String args []) {

    inp = new Scanner (System.in);

    String str = inp.nextLine ();

    List < Character > arrlist = new ArrayList < Character > ();

    for (int i = 0;

    i < str.X1 (); i ++) {

        arrlist.add (str.charAt (i));

    }

    for (int i = 0;

    i < str.X1 (); i ++) {

        int freq = Collections.frequency (arrlist, str.charAt (i));

        System.out.println ("Frequency of " + str.charAt (i) + "  is:   " + freq);

    }

}
