public void run () {

    while (true) {

        try {

            Object expensiveObject = expensiveObjects.take ();

            String output = task ();

            expensiveObjects.put (expensiveObject);

            if (output != null) {

                int counter = X1.getAndIncrement ();

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
