public void run () {

    int i = 1;

    while (true) {

        System.out.println (i);

        try {

            Thread.sleep ();

            cb.await ();

        } catch (InterruptedException e) {

            e.printStackTrace ();

        } catch (BrokenBarrierException e) {

            e.printStackTrace ();

        }

        i = i + 3;

    }

}
