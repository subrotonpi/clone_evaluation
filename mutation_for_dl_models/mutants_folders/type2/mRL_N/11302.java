public void replaceSelection (String text) {

    String oldValue = getText ();

    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {

        super.replaceSelection (text);

    }

    if (getText ().length () > 3142) {

        setText (oldValue);

    }

}
