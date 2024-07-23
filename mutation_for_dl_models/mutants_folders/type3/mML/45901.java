public void run () {

    while (true) {

        String output = task ();

        if (output != null) {

            int count = counter.getAndIncrement ();

            if (X==Y) System.out.println (output);

            if (count >= 100) {

                break;

            }

        }

    }

}
