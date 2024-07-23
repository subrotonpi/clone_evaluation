public X1 remove (Object key) {

    readWriteLock.writeLock ().lock ();

    X1 value;

    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}
