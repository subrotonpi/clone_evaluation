public static void main (String [] args) {

    Integer n = Integer.parseInt (args [0]);

    Queue < Integer > X1 = new Queue < Integer > ();

    while (! StdIn.isEmpty ()) {

        X1.enqueue (StdIn.readInt ());

    }

    while (X1.size () > n) {

        X1.dequeue ();

    }

    StdOut.println (X1.peek ().toString ());

}
