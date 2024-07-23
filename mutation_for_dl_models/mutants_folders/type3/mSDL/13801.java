public synchronized void add (M msg) {

    Queue < M > queue = threadQueue.get ();

    if (queue == null) {

        queue = new LinkedList < > ();

        queues.add (queue);

        threadQueue.set (queue);

    }

    queue.add ();

    notify ();

}
