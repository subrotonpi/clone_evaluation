public VV remove (String X1) {

    synchronized (lock) {

        Item < VV > item = cache.remove (key);

        if (item != null) {

            return item.payload;

        } else {

            return null;

        }

    }

}
