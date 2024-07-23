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

        map.put (X1,key, val);

        currentSize ++;

    }

}
