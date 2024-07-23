public static void main (String [] args) {

    HashMap < Character, X1 > hm = new HashMap < Character, X1 > ();

    System.out.println ("Enter an String:");

    Scanner sc = new Scanner (System.in);

    String s1 = sc.nextLine ();

    for (int i = 0;

    i < s1.length (); i ++) {

        if (! hm.containsKey (s1.charAt (i))) {

            hm.put (s1.charAt (i), (X1) 1);

        } else {

            hm.put (s1.charAt (i), hm.get (s1.charAt (i)) + 1);

        }

    }

    System.out.println ("The Charecters are:" + hm);

}
