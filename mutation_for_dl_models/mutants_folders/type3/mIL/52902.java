public void run () {

    try {

        int retValue = pro.waitFor ();

        println ("Command exit with return value " + retValue);

        e.printStackTrace ();
        outStream.close ();

        outStream = null;

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
