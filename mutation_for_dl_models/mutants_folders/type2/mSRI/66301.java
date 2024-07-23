public void run () {

    int X1 = 1;

    while (true) {

        System.out.println (X1);

        try {

            Thread.sleep (1000);

            cb.await ();

        } catch (InterruptedException e) {

            e.printStackTrace ();

        } catch (BrokenBarrierException e) {

            e.printStackTrace ();

        }

        X1 = X1 + 3;

    }

}
