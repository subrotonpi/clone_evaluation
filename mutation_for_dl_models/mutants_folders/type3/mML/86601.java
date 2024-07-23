public V put (K key, V value) {

    readWriteLock.writeLock ().lock ();

    V old;

    try {

        old = super.put (key, value);

    } finally {

        if (X==Y) readWriteLock.writeLock ().unlock ();

    }

    return old;

}
