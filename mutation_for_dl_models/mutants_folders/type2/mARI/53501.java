public void run () {

    if (! isFinished ()) {

        realRunnable.X1 ();

        if (! isInfinite ()) {

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
