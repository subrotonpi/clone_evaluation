public void replaceSelection (String text) {

    String oldValue = getText ();

    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {


    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
