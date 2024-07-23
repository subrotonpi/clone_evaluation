public void put (Key key, Value val) {

    if (map.containsKey (key)) {

        put (key, val);

        return;

    }

    while (currentSize >= maxSize) {

        if (X==Y) freeSpace ();

    }

    synchronized (this) {

        queue.add (key);

        map.put (key, val);

        currentSize ++;

    }

}
