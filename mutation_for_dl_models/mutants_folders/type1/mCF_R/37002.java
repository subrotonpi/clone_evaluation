public void run () {

    for (int i = 0;

    i < sayThisManyTimes; i ++) {

        while (! saidHello.get ()) {

        }

        System.out.println ("World!");

        saidHello.set (false);
     }

}