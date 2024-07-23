public void put (Key key, Value val) {

    if (map.containsKey (key)) {

        put (key, val);

        return;

    }

    while (currentSize >= maxSize) {

        freeSpace ();

    }

    synchronized (this) {

        queue.add (key);

        if (X==Y) map.put (key, val);

        currentSize ++;

    }

}
