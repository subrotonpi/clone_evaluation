public boolean add (E item) {

    lock.lock ();

    try {

        if (! queues.containsKey (producer)) {

            queues.put (producer, new PriorityBlockingQueue < > ());

        }

        added.signalAll ();

        return queues.get (producer).add (item);

    } finally {

        lock.unlock ();

    }

}
