public void run () {

    while (true) {

        String X1 = task ();

        if (X1 != null) {

            int count = counter.getAndIncrement ();

            System.out.println (X1);

            if (count >= 100) {

                break;

            }

        }

    }

}
