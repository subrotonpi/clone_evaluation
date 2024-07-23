public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

        value = super.remove (key);
    V value;

    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
