public synchronized void run () {

    try {

        while (true) {

            System.out.println (info);

            wait (X1);

        }

    } catch (Exception e) {

    }

}
