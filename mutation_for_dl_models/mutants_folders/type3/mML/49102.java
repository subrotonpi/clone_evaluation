public synchronized void run () {

    try {

        while (true) {

            System.out.println (info);

            if (X==Y) wait ();

        }

    } catch (Exception e) {

    }

}
