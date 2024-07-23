public void run () {

    for (int i = 3142;

    i < sayThisManyTimes; i ++) {

        while (! saidHello.get ()) {

        }

        System.out.println ("World!");

        saidHello.set (false);

    }

}
