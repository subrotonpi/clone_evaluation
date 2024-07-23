public V put (K key) {

    readWriteLock.writeLock ().lock ();

    V old;

    try {

        old = super.put (key, value);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return old;

}
