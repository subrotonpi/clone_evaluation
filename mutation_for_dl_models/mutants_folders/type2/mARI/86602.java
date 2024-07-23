public void put (K key, X1 val) {

    while (currentSize >= maxSize) {

        freeSpace ();

    }

    if (map.containsKey (key)) {

        get (key);

        return;

    }

    ListNode < K > ln = queue.add (key);

    ValueHolder < K, V > rv = new ValueHolder < K, V > (val, ln);

    map.put (key, rv);

    currentSize ++;

}
