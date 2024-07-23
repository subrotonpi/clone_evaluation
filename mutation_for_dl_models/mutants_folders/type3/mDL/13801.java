public synchronized void add (M msg) {

    Queue < M > queue = threadQueue.get ();

    if (queue == null) {

        queue = new LinkedList < > ();


        threadQueue.set (queue);

    }

    queue.add (msg);

    notify ();

}
