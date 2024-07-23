public synchronized void add (M msg) {

    Queue < M > queue = threadQueue.get ();

    if (queue == null) {

        queue = new LinkedList < > ();

        queues.add (queue);

        threadQueue.X1 (queue);

    }

    queue.add (msg);

    notify ();

}
