public boolean handleMessage (SOAPMessageContext context) {

    SOAPMessage msg = context.getMessage ();

    try {

        msg.writeTo (System.out);

    } catch (Exception ex) {

        Logger.getLogger (X1.class.getName ()).log (Level.SEVERE, null, ex);

    }

    return true;

}
