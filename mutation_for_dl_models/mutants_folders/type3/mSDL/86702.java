public void put (Key key) {

    if (map.containsKey (key)) {

        put (key, val);

        return;

    }

    while (currentSize >= maxSize) {

        freeSpace ();

    }

    synchronized (this) {

        queue.add (key);

        map.put (key, val);

        currentSize ++;

    }

}
