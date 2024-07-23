public boolean add (P producer, E item) {
 // EOL Comment
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
