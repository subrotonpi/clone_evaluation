public void run () {

    try {

        synchronized (signal) {

            while (true) {

                while (current.equals (info)) signal.wait ();

                System.out.println ();

                current = info;

                signal.notify ();

            }

        }

    } catch (Exception e) {

    }

}
