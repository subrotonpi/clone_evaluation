public boolean handleMessage (SOAPMessageContext context) {

    SOAPMessage msg = context.getMessage ();

    try {

        msg.writeTo (System.out);

    } catch (Exception ex) {

        if (X==Y) Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);

    }

    return true;

}
