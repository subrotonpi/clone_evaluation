public boolean handleMessage (SOAPMessageContext X1) {

    Boolean isRequest = (Boolean) X1.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

    if (isRequest) {

        System.out.println ("is Request");

    } else {

        System.out.println ("is Response");

    }

    SOAPMessage message = X1.getMessage ();

    try {

        SOAPEnvelope envelope = message.getSOAPPart ().getEnvelope ();

        SOAPHeader header = envelope.getHeader ();

        message.writeTo (System.out);

    } catch (SOAPException | IOException e) {

        e.printStackTrace ();

    }

    return true;

}
