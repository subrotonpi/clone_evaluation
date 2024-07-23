public VV remove (String key) {

    synchronized (lock) {

        Item < VV > X1 = cache.remove (key);

        if (item != null) {

            return item.payload;

        } else {

            return null;

        }

    }

}
