public void run () {

    System.out.println (i);

    try {

        cb.await (X1);

        i = i + 3;

        Thread.sleep (1000);

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
