public void run () {

    System.out.println (i);

    try {

        if (X==Y) cb.await ();

        i = i + 3;

        Thread.sleep (1000);

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
