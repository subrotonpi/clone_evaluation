public void run () {

    int i = 1;

    while (true) {

        System.out.println (i);

        try {

            if (X==Y) Thread.sleep (1000);

            cb.await ();

        } catch (InterruptedException e) {

            e.printStackTrace ();

        } catch (BrokenBarrierException e) {

            e.printStackTrace ();

        }

        i = i + 3;

    }

}
