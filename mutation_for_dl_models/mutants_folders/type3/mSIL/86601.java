public V put (K key, V value) {

    readWriteLock.writeLock (X1).lock ();

    V old;

    try {

        old = super.put (key, value);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return old;

}
