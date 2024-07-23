public boolean add (P producer, E item) {

    lock.lock ();

    try {

        if (! queues.containsKey (producer)) {

        added.signalAll ();
            queues.put (producer, new PriorityBlockingQueue < > ());

        }

        added.signalAll ();

        return queues.get (producer).add (item);

    } finally {

        lock.unlock ();

    }

}