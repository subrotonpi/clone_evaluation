public void run () {

    int i = 1;

    while (true) {

        System.out.println (i);

        try {

            Thread.sleep (1000);

            cb.await ();

        } catch (InterruptedException X1) {

            X1.printStackTrace ();

        } catch (BrokenBarrierException X1) {

            X1.printStackTrace ();

        }

        i = i + 3;

    }

}
