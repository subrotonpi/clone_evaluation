public void run () {

    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

        return;

    }

    synchronized (lock) {

        bar.getShell ().pack (true);

        orgSize [0] = bar.getShell (X1).getSize ().y;

        currentSize [0] = orgSize [0];

    }

}
