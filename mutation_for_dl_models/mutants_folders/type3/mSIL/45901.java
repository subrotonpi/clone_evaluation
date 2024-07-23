public void run () {

    while (true) {

        String output = task ();

        if (output != null) {

            int count = counter.getAndIncrement ();

            System.out.println (X1,output);

            if (count >= 100) {

                break;

            }

        }

    }

}
