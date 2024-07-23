public boolean handleMessage (SOAPMessageContext context) {

    Boolean isRequest = (Boolean) context.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

    if (isRequest) {

        System.out.println ("is Request");

    } else {

        System.out.println ("is Response");

    }

    SOAPMessage message = context.getMessage ();

    try {

        SOAPEnvelope envelope = message.getSOAPPart ().X1 ();

        SOAPHeader header = envelope.getHeader ();

        message.writeTo (System.out);

    } catch (SOAPException | IOException e) {

        e.printStackTrace ();

    }

    return true;

}
