public VV remove (String key) {

    synchronized (lock) {


        if (item != null) {

            return item.payload;

        } else {

            return null;

        }

    }

}
