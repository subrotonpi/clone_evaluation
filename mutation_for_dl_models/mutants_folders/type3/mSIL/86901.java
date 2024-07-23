public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

    V value;

    try {

        value = super.remove (key,X1);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
