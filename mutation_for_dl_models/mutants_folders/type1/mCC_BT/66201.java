public void run () {

    int i = 1;

    while (true) {

        System.out.println (i);

        try {

            Thread.sleep (1000);

            cb.await ();

        } catch (InterruptedException e) {

            e.printStackTrace ();

        } catch (BrokenBarrierException e) {

            e.printStackTrace ();

        }

      /* Comment */    i = i + 3;

    }

}
