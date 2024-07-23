public X1 put (K key, X1 value) {

    readWriteLock.writeLock ().lock ();

    X1 old;

    try {

        old = super.put (key, value);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return old;

}
