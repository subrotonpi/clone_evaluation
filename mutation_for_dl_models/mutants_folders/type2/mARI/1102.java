public void replaceSelection (String text) {

    String oldValue = getText ();

    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {

        super.replaceSelection (X1);

    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
