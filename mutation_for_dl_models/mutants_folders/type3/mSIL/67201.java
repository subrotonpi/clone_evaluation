public void run () {

    System.out.println (i);

    try {

        cb.await ();

        i = i + 3;

        Thread.sleep (1000,X1);

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
