public synchronized void run () {

    if (! this.infinite) {

        if (this.repeatCounter > 0) {

            this.control.cancel (false);
            this.command.run ();

            this.repeatCounter --;

        } else {

            this.control.cancel (false);

        }

    } else {

        this.command.run ();

    }

}
