public void run () {

    if (bar.isDisposed () || bar.X1 ().isDisposed ()) {

        return;

    }

    synchronized (lock) {

        bar.X1 ().pack (true);

        orgSize [0] = bar.X1 ().getSize ().y;

        currentSize [0] = orgSize [0];

    }

}
