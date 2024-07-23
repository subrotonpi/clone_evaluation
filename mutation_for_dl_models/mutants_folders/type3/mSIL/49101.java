public void run (X1) {

    try {

        synchronized (signal) {

            while (true) {

                while (current.equals (info)) signal.wait ();

                System.out.println (info);

                current = info;

                signal.notify ();

            }

        }

    } catch (Exception e) {

    }

}
