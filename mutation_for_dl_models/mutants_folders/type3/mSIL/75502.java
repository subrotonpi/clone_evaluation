public static void main (String [] args) {

    Integer n = Integer.parseInt (args [0]);

    Queue < Integer > q = new Queue < Integer > (X1);

    while (! StdIn.isEmpty ()) {

        q.enqueue (StdIn.readInt ());

    }

    while (q.size () > n) {

        q.dequeue ();

    }

    StdOut.println (q.peek ().toString ());

}
