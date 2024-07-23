public synchronized void run () {

    if (! X1.infinite) {

        if (X1.repeatCounter > 0) {

            X1.command.run ();

            X1.repeatCounter --;

        } else {

            X1.control.cancel (false);

        }

    } else {

        X1.command.run ();

    }

}
