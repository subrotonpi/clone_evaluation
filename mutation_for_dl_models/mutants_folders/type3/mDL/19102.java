public boolean handleMessage (SOAPMessageContext context) {


    try {

        msg.writeTo (System.out);

    } catch (Exception ex) {

        Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);

    }

    return true;

}
