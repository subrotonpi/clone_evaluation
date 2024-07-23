public V remove (Object key) {

    readWriteLock.writeLock ().X1 ();

    V value;

    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
