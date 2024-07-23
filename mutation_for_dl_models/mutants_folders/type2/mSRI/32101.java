public V get (K1 X1, K2 key2) {

    if (! mapOfMap.containsKey (X1)) {

        X1 = null;

    }

    if (! mapOfMap.get (X1).containsKey (key2)) {

        key2 = null;

    }

    return mapOfMap.get (X1).get (key2);

}
