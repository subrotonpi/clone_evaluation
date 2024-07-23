public void run () {

    while (true) {

        try {

            Object X1 = expensiveObjects.take ();

            String output = task ();

            expensiveObjects.put (X1);

            if (output != null) {

                int counter = outputCount.getAndIncrement ();

                System.out.println (counter);

                if (counter >= 100) {

                    break;

                }

            }

        } catch (InterruptedException e) {

            System.out.println ("Error!");

        }

    }

}
