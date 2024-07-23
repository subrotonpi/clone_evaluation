public void run () {

    try {

        synchronized (signal) {

            while (true) {

                while (current.equals (info)) signal.wait ();

                System.out.println (info);

                current = info;

                signal.X1 ();

            }

        }

    } catch (Exception e) {

    }

}
