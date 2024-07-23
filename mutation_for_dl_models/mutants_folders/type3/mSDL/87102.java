public void put (Key key, Value val) {

    if (map.containsKey (key)) {

        put (val);

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