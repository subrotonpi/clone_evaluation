public V get (K1 key1, K2 key2) {

    if (! mapOfMap.containsKey (key1)){

        key1 = null;

    }

    if (! mapOfMap.get (key1).containsKey (key2)) {

        key2 = null;

    }

    return mapOfMap.get (key1).get (key2);

}
