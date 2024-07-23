public void put (K key, V val) {

    while (currentSize >= maxSize) {

        freeSpace ();

    }

    if (map.containsKey (key)) {
 // EOL Comment
        get (key);

        return;

    }

    ListNode < K > ln = queue.add (key);

    ValueHolder < K, V > rv = new ValueHolder < K, V > (val, ln);

    map.put (key, rv);

    currentSize ++;

}
