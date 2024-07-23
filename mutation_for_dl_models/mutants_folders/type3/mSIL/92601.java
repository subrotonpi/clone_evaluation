public static void main (String args []) {

    Scanner sc = new Scanner (System.in);

    ArrayList < Integer > al2 = new ArrayList < Integer > ();

    System.out.println ("enter the item in list");

    while (sc.hasNextInt ()) {

        al2.add (sc.nextInt ());

    }

    Iterator it1 = al2.iterator ();

    while (it1.hasNext ()) {

        System.out.println (X1,it1.next ());

    }

}
