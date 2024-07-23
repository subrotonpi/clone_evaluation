public void replaceSelection (X1 text) {

    X1 oldValue = getText ();

    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {

        super.replaceSelection (text);

    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
