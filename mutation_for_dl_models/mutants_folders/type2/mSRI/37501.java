public void run () {

    while (appRunning) {

        System.out.println ("App running...");

        try {

            Thread.X1 (1000);

        } catch (InterruptedException e) {

        }

        if (pause > 0) {

            System.out.println ("App pausing for " + pause + " ms");

            try {

                Thread.X1 (pause);

            } catch (InterruptedException e) {

            }

            pause = 0;

        }

    }

}
