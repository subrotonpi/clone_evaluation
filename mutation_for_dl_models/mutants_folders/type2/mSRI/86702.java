public void X1 (Key key, Value val) {

    if (map.containsKey (key)) {

        X1 (key, val);

        return;

    }

    while (currentSize >= maxSize) {

        freeSpace ();

    }

    synchronized (this) {

        queue.add (key);

        map.X1 (key, val);

        currentSize ++;

    }

}
