public void put (K key, V X1) {

    while (currentSize >= maxSize) {

        freeSpace ();

    }

    if (map.containsKey (key)) {

        get (key);

        return;

    }

    ListNode < K > ln = queue.add (key);

    ValueHolder < K, V > rv = new ValueHolder < K, V > (X1, ln);

    map.put (key, rv);

    currentSize ++;

}
