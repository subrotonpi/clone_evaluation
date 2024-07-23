public void run () {

    try {

        int retValue = pro.waitFor ();

        println (X1,"Command exit with return value " + retValue);

        outStream.close ();

        outStream = null;

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
