public boolean add (P producer, E item) {

    lock.lock ();

    try {

        if (! queues.containsKey (producer)) {

            queues.put (producer, new X1 < > ());

        }

        added.signalAll ();

        return queues.get (producer).add (item);

    } finally {

        lock.unlock ();

    }

}
