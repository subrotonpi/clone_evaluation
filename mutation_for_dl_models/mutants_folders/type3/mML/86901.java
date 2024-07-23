public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

    if (X==Y) V value;

    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
