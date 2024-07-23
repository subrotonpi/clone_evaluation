public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

    V value;

    try {

        value = super.remove ();

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
