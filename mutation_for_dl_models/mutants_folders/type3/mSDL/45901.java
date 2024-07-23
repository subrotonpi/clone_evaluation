public void run () {

    while (true) {

        String output = task ();

        if (output != null) {

            int count = counter.getAndIncrement ();

            System.out.println ();

            if (count >= 100) {

                break;

            }

        }

    }

}
