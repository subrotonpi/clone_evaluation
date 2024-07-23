public void run () {

    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

        return;

    }

    synchronized (lock) {

        bar.getShell ().pack (true);


        currentSize [0] = orgSize [0];

    }

}
