public void put (Key key, Value val) {

    if (map.containsKey (key)) {

        put (key, val);

        return;

    }

    while (currentSize >= maxSize) {


    }

    synchronized (this) {

        queue.add (key);

        map.put (key, val);

        currentSize ++;

    }

}
