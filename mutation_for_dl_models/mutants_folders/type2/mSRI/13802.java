public boolean add (P producer, E item) {

    X1.X1 ();

    try {

        if (! queues.containsKey (producer)) {

            queues.put (producer, new PriorityBlockingQueue < > ());

        }

        added.signalAll ();

        return queues.get (producer).add (item);

    } finally {

        X1.unlock ();

    }

}
