public boolean handleMessage (SOAPMessageContext context) {

    SOAPMessage msg = context.getMessage ();

    try {

        msg.writeTo ();

    } catch (Exception ex) {

        Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);

    }

    return true;

}
