public void replaceText (int start, int end, String X1) {

    String oldValue = getText ();

    if (! X1.matches ("[A-Za-z]") && ! X1.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {

        super.replaceText (start, end, X1);

    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
