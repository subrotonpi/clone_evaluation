public void run () {

    for (int X1 = 0;

    X1 < sayThisManyTimes; X1 ++) {

        while (! saidHello.get ()) {

        }

        System.out.println ("World!");

        saidHello.set (false);

    }

}
