public void run () {

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
 // EOL Comment
}
