public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

    V value;

    try {

        value = super.remove (key); // EOL Comment

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
