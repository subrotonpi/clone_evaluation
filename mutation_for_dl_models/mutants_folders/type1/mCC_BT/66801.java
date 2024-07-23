public void run () {

    System.out.println (i);

    try {

        cb.await ();

        i = i + 3;

        Thread.sleep (1000);

    } catch (InterruptedException e) {

     /* Comment */     e.printStackTrace ();

    } catch (BrokenBarrierException e) {

        e.printStackTrace ();

    }

}
