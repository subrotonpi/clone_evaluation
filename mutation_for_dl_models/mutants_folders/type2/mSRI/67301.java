public void run () {

    System.out.println (X1);

    try {

        cb.await ();

        X1 = X1 + 3;

        Thread.sleep (1000);

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
