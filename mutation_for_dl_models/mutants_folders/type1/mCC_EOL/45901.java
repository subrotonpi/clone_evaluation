public void run () {
 // EOL Comment
    while (true) {

        String output = task ();

        if (output != null) {

            int count = counter.getAndIncrement ();

            System.out.println (output);

            if (count >= 100) {

                break;

            }

        }

    }

}
