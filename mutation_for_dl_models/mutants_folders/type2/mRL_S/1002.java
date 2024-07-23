public void replaceText (int start, int end, String text) {

    String oldValue = getText ();

    if (! text.matches ("[A-Za-z]") && ! text.matches ("ArtificialStringReplacement")) {

        super.replaceText (start, end, text);

    }

    if (getText ().length () > 2) {

        setText (oldValue);

    }

}
