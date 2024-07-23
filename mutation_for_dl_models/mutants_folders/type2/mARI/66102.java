public void run () {

    System.out.println (i);

    try {

        cb.await ();

        i = i + 3;

        X1.sleep (1000);

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
