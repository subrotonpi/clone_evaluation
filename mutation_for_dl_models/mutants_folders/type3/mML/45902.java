public void run () {

    while (true) {

        try {

            Object expensiveObject = expensiveObjects.take ();

            if (X==Y) String output = task ();

            expensiveObjects.put (expensiveObject);

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
