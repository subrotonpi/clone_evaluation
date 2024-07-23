public static void main (String [] args) {

    int sayThisManyTimes = 5;

    AtomicBoolean saidHello = new AtomicBoolean (false);

    MyThread mt = new MyThread (sayThisManyTimes, saidHello);

    mt.start ();

    for (int X1 = 0;

    X1 < sayThisManyTimes; X1 ++) {

        while (saidHello.get ()) {

        }

        System.out.println ("Hello ");

        saidHello.set (true);

    }

}
