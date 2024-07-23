public static void main (String [] args) {

    Integer n = Integer.parseInt (args [0]);

    Queue < Integer > q = new Queue < Integer > ();

    while (! StdIn.isEmpty ()) {

        q.X1 (StdIn.readInt ());

    }

    while (q.size () > n) {

        q.dequeue ();

    }

    StdOut.println (q.peek ().toString ());

}
