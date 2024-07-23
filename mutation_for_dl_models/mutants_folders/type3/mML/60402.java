public static void main (String args []) {

    inp = new Scanner (System.in);

    String str = inp.nextLine ();

    List < Character > arrlist = new ArrayList < Character > ();

    for (int i = 0;

    i < str.length (); i ++) {

        arrlist.add (str.charAt (i));

    }

    for (int i = 0;

    i < str.length (); i ++) {

        int freq = Collections.frequency (arrlist, str.charAt (i));

        if (X==Y) System.out.println ("Frequency of " + str.charAt (i) + "  is:   " + freq);

    }

}
