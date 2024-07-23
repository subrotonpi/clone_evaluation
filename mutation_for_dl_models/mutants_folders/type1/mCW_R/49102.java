public synchronized void run () {

    try {

        while (true) {

            System.out.println (info);

            wait ();

        }

    } catch(Exception e) {

    }

}
