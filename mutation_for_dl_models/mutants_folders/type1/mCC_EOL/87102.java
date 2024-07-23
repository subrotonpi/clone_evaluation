public void put (Key key, Value val) {

    if (map.containsKey (key)) {

        put (key, val);

        return;

    }
 // EOL Comment
    while (currentSize >= maxSize) {

        freeSpace ();

    }

    synchronized (this) {

        queue.add (key);

        map.put (key, val);

        currentSize ++;

    }

}
