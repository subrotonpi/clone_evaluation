public void run () {

    while (true) {

        String output = task ();

        if (output != null) {

            int count = counter.getAndIncrement ();

            System.out.println (output);

            if (X1 >= 100) {

                break;

            }

        }

    }

}
