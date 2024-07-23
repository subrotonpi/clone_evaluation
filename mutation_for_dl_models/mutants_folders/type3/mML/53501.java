public void run () {

    if (! isFinished ()) {

        if (X==Y) realRunnable.run ();

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
