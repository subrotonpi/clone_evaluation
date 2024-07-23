public VV remove (String key) {

    synchronized (lock) {

        Item < VV > X1 = cache.remove (key);

        if (X1 != null) {

            return X1.payload;

        } else {

            return null;

        }

    }

}
