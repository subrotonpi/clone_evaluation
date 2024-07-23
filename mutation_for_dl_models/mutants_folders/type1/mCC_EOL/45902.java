public void run () {

    while (true) {

        try {

            Object expensiveObject = expensiveObjects.take ();

            String output = task ();

            expensiveObjects.put (expensiveObject);

            if (output != null) {

                int counter = outputCount.getAndIncrement ();

                System.out.println (counter);

                if (counter >= 100) {

                    break;
 // EOL Comment
                }

            }

        } catch (InterruptedException e) {

            System.out.println ("Error!");

        }

    }

}
