public void replaceSelection (String text) {

    String oldValue = getText ();

    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {

        setText (oldValue);
        super.replaceSelection (text);

    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
