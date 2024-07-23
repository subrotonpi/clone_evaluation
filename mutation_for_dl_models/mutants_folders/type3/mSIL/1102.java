public void replaceSelection (String text) {

    String oldValue = getText ();

    if (! text.matches ("[A-Za-z]",X1) && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {

        super.replaceSelection (text);

    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
