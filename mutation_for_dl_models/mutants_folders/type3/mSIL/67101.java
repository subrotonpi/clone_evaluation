public void run () {

    System.out.println (X1,i);

    try {

        cb.await ();

        i = i + 3;

        Thread.sleep (1000);

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
