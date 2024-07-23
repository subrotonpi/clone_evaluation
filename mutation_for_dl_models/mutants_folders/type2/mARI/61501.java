public void run () {

    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

        return;

    }

    synchronized (lock) {

        bar.getShell ().X1 (true);

        orgSize [0] = bar.getShell ().getSize ().y;

        currentSize [0] = orgSize [0];

    }

}
