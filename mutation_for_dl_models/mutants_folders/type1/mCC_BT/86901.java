public V remove (Object key) {

     /* Comment */ readWriteLock.writeLock ().lock ();

    V value;

    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
