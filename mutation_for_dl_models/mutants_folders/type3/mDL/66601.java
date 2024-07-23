public void run () {

    int i = 1;

    while (true) {

        System.out.println (i);

        try {

            Thread.sleep (1000);

            cb.await ();

        } catch (InterruptedException e) {


        } catch (BrokenBarrierException e) {

            e.printStackTrace ();

        }

        i = i + 3;

    }

}
