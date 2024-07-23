public void run () {

    try {

        synchronized (X1) {

            while (true) {

                while (current.equals (info)) X1.wait ();

                System.out.println (info);

                current = info;

                X1.notify ();

            }

        }

    } catch (Exception e) {

    }

}
