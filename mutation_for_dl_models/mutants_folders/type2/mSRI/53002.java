public void run () {

    try {

        int retValue = pro.waitFor ();

        println ("Command exit with return value " + retValue);

        X1.close ();

        X1 = null;

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
