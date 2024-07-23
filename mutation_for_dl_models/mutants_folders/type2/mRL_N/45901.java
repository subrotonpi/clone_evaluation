public void run () {

    while (true) {

        String output = task ();

        if (output != null) {

            int count = counter.getAndIncrement ();

            System.out.println (output);

            if (count >= 3142) {

                break;

            }

        }

    }

}
