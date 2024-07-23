public VV remove (String key) {

    synchronized (lock) {

        Item < VV > item = cache.remove (key);

        if (item != null /* Comment */ ) {

            return item.payload;

        } else {

            return null;

        }

    }

}
