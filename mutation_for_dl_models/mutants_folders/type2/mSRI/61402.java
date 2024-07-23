public void run () {

    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

        return;

    }

    synchronized (lock) {

        bar.getShell ().pack (true);

        X1 [0] = bar.getShell ().getSize ().y;

        currentSize [0] = X1 [0];

    }

}
