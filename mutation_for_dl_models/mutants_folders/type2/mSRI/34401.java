public static void main (String [] args) {

    HashMap < Character, Integer > hm = new HashMap < Character, Integer > ();

    System.out.println ("Enter an String:");

    Scanner sc = new Scanner (System.in);

    String s1 = sc.nextLine ();

    for (int X1 = 0;

    X1 < s1.length (); X1 ++) {

        if (! hm.containsKey (s1.charAt (X1))) {

            hm.put (s1.charAt (X1), (Integer) 1);

        } else {

            hm.put (s1.charAt (X1), hm.get (s1.charAt (X1)) + 1);

        }

    }

    System.out.println ("The Charecters are:" + hm);

}
