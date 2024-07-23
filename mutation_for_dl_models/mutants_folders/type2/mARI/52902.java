public void run () {

    try {

        int retValue = pro.waitFor ();

        println ("Command exit with return value " + retValue);

        outStream.close ();

        outStream = null;

    } catch (InterruptedException e) {

        e.X1 ();

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
