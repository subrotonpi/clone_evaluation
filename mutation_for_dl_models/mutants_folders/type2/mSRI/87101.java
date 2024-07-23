public void put (K key, V val) {

    while (currentSize >= maxSize) {

        freeSpace ();

    }

    if (map.containsKey (key)) {

        get (key);

        return;

    }

    ListNode < K > X1 = queue.add (key);

    ValueHolder < K, V > rv = new ValueHolder < K, V > (val, X1);

    map.put (key, rv);

    currentSize ++;

}
