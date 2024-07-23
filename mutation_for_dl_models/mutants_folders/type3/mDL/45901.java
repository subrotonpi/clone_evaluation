public void run () {

    while (true) {

        String output = task ();

        if (output != null) {

            int count = counter.getAndIncrement ();


            if (count >= 100) {

                break;

            }

        }

    }

}
