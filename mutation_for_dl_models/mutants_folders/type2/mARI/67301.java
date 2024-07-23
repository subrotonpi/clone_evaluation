public void run () {

    System.out.println (i);

    try {

        cb.await ();

        i = X1 + 3;

        Thread.sleep (1000);

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
