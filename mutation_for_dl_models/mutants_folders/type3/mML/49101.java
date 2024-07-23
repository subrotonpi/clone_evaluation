public void run () {

    try {

        synchronized (signal) {

            while (true) {

                while (current.equals (info)) signal.wait ();

                if (X==Y) System.out.println (info);

                current = info;

                signal.notify ();

            }

        }

    } catch (Exception e) {

    }

}
