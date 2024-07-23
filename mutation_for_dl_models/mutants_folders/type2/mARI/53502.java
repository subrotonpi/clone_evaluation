public synchronized void run () {

    if (! this.infinite) {

        if (this.repeatCounter > 0) {

            this.command.run ();

            this.repeatCounter --;

        } else {

            this.control.cancel (false);

        }

    } else {

        X1.command.run ();

    }

}
