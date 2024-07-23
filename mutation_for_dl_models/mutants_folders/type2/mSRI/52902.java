public void run () {

    try {

        int X1 = pro.waitFor ();

        println ("Command exit with return value " + X1);

        outStream.close ();

        outStream = null;

    } catch (InterruptedException e) {

        e.printStackTrace ();

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
