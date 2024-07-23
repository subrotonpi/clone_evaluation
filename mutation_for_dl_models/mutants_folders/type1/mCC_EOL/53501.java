public void run () {

    if (! isFinished ()) {

        realRunnable.run ();

        if (! isInfinite ()) {
 // EOL Comment
            repetitions --;

            if (isFinished ()) {

                synchronized (this) {

                    if (self == null) {

                        try {

                            wait ();

                        } catch (Exception e) {

                        }

                    }

                    self.cancel (false);

                }

            }

        }

    }

}
