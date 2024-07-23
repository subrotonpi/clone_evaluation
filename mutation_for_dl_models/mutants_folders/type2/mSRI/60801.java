public static void main (String args []) {

    X1 = new Scanner (System.in);

    String str = X1.nextLine ();

    List < Character > arrlist = new ArrayList < Character > ();

    for (int i = 0;

    i < str.length (); i ++) {

        arrlist.add (str.charAt (i));

    }

    for (int i = 0;

    i < str.length (); i ++) {

        int freq = Collections.frequency (arrlist, str.charAt (i));

        System.out.println ("Frequency of " + str.charAt (i) + "  is:   " + freq);

    }

}
