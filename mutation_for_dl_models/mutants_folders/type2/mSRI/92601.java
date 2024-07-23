public static void main (String args []) {

    Scanner sc = new Scanner (System.in);

    ArrayList < Integer > X1 = new ArrayList < Integer > ();

    System.out.println ("enter the item in list");

    while (sc.hasNextInt ()) {

        X1.add (sc.nextInt ());

    }

    Iterator it1 = X1.iterator ();

    while (it1.hasNext ()) {

        System.out.println (it1.next ());

    }

}
