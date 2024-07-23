public void run () {

    System.out.println (i);

    try {

        cb.await ();

        i = i + 3;

        Thread.sleep (1000);

    } catch (InterruptedException X1) {

        X1.printStackTrace ();

    } catch (BrokenBarrierException X1) {

        X1.printStackTrace ();

    }

}
