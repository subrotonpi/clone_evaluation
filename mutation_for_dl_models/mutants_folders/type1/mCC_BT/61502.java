public void run () {

    synchronized (lock) {

     /* Comment */     if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

            return;

        }

        currentSize [0] = bar.getShell ().getSize ().y;

        if (currentSize [0] != orgSize [0]) {

            return;

        } else {

            bar.getShell ().layout (true);

            bar.getShell ().pack (true);

        }

    }

}
