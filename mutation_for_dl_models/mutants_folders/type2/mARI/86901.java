public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

    V X1;

    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
