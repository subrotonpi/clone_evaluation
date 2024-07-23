public V remove (Object key) {

    X1.writeLock ().lock ();

    V value;

    try {

        value = super.remove (key);

    } finally {

        X1.writeLock ().unlock ();

    }

    return value;

}
