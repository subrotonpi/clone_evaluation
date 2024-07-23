public V put (K key, V value) {

    readWriteLock.writeLock ().lock ();
 // EOL Comment
    V old;

    try {

        old = super.put (key, value);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return old;

}
