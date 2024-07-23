public void run () {

    while (appRunning) {

        System.out.println ("App running...");

        try {

      
      Thread.sleep (1000);

        } catch (InterruptedException e) {

        }

        if (pause > 0) {

            System.out.println ("App pausing for " + pause + " ms");

            try {

                Thread.sleep (pause);

            } catch (InterruptedException e) {

            }

            pause = 0;

        }

    }

}
