public VV remove (String key) {

    synchronized (lock) {

        Item < VV > item = cache.remove (key);

        if (item != null) {

            return item.payload;

        } else {
 // EOL Comment
            return null;

        }

    }

}
