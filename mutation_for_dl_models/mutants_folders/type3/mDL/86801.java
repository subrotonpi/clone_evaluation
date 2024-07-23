public V remove (Object key) {

    readWriteLock.writeLock ().lock ();


    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
