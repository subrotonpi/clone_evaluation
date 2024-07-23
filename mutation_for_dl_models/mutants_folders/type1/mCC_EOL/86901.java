public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

    V value;

    try {

        value = super.remove (key);

    } finally { // EOL Comment

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
