public void run () {

    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

        return;

    }

    synchronized (lock) {

        bar.getShell ().pack (true);

        orgSize [0] = X1.getShell ().getSize ().y;

        currentSize [0] = orgSize [0];

    }

}
