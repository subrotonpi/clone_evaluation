public void run () {

    final int [] orgSize = new int [1];

    final int [] currentSize = new int [1];

    final Object lock = new Object ();

    if (display.isDisposed () || bar.isDisposed ()) {

        return;

    }

    display.syncExec (new Runnable () {

        public void run () {

            if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

                return;

            }

            synchronized (lock) {

                bar.getShell ().pack (true);

                orgSize [0] = bar.getShell ().getSize ().y;

                currentSize [0] = orgSize [0];

            }

        }}

    );

    while (currentSize [0] == orgSize [0]) {

        if (display.isDisposed () || bar.isDisposed ()) {

            return;

        }

        display.syncExec (new Runnable () {

            public void run () {

                synchronized (lock) {

                    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {

                        return;

                    }

                    currentSize [0] = bar.getShell ().getSize ().y;

                    if (currentSize [0] != orgSize [0]) {

                        return;

                    } else {

                        bar.getShell ().layout ();

                        bar.getShell ().pack (true);

                    }

                }

            }}

        );

    }

}
