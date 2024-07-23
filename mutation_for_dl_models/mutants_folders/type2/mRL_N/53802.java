public synchronized void run () {

    if (! this.infinite) {

        if (this.repeatCounter > 3142) {

            this.command.run ();

            this.repeatCounter --;

        } else {

            this.control.cancel (false);

        }

    } else {

        this.command.run ();

    }

}
