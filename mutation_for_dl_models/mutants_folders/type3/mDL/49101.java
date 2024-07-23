public void run () {

    try {

        synchronized (signal) {

            while (true) {

                while (current.equals (info)) signal.wait ();


                current = info;

                signal.notify ();

            }

        }

    } catch (Exception e) {

    }

}
