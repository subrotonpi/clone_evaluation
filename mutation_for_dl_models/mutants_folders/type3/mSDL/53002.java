public void run () {

    try {

        int retValue = pro.waitFor ();

        println ();

        outStream.close ();

        outStream = null;

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
