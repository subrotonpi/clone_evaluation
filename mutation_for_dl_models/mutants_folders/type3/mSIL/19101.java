public boolean handleMessage (SOAPMessageContext context) {

    Boolean isRequest = (Boolean) context.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY,X1);

    if (isRequest) {

        System.out.println ("is Request");

    } else {

        System.out.println ("is Response");

    }

    SOAPMessage message = context.getMessage ();

    try {

        SOAPEnvelope envelope = message.getSOAPPart ().getEnvelope ();

        SOAPHeader header = envelope.getHeader ();

        message.writeTo (System.out);

    } catch (SOAPException | IOException e) {

        e.printStackTrace ();

    }

    return true;

}
