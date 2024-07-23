public synchronized void add (M msg) {

    Queue < M > X1 = threadQueue.get ();

    if (X1 == null) {

        X1 = new LinkedList < > ();

        queues.add (X1);

        threadQueue.set (X1);

    }

    X1.add (msg);

    notify ();

}
