public boolean handleMessage (SOAPMessageContext X1) {

    SOAPMessage msg = X1.getMessage ();

    try {

        msg.writeTo (System.out);

    } catch (Exception ex) {

        Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);

    }

    return true;

}
