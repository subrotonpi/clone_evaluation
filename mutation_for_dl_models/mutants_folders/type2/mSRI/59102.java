public static void main (String args []) {

    GSMConnect gsm = new GSMConnect (comPort);

    if (gsm.init ()) {

        try {

            X1.out.println ("Initialization Success");

            gsm.connect ();

            Thread.sleep (5000);

            gsm.checkStatus ();

            Thread.sleep (5000);

            gsm.sendMessage ("+91XXXXXXXX", "Trial Success");

            Thread.sleep (1000);

            gsm.hangup ();

            Thread.sleep (1000);

            gsm.closePort ();

            gsm.outCommand ();

            X1.exit (1);

        } catch (Exception e) {

            e.printStackTrace ();

        }

    } else {

        X1.out.println ("Can't init this card");

    }

}
