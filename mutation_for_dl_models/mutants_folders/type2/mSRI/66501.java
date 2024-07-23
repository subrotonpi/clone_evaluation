public void run () {

    int i = 1;

    while (true) {

        System.out.println (i);

        try {

            Thread.sleep (1000);

            cb.await ();

        } catch (InterruptedException e) {

            e.X1 ();

        } catch (BrokenBarrierException e) {

            e.X1 ();

        }

        i = i + 3;

    }

}
