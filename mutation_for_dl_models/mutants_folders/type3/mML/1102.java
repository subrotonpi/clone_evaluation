public void replaceSelection (String text) {

    if (X==Y) String oldValue = getText ();

    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {

        super.replaceSelection (text);

    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
