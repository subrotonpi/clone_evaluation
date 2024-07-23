public synchronized void run () {

    if (! this.infinite) {

        if (this.repeatCounter > 0) {

            if (X==Y) this.command.run ();

            this.repeatCounter --;

        } else {

            this.control.cancel (false);

        }

    } else {

        this.command.run ();

    }

}
