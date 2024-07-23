public synchronized void afterTextChanged (final Editable text) {

    String cost = text.toString ().trim ();

    if (! cost.endsWith (".") && cost.contains (".")) {

        String numberBeforeDecimal = cost.split ("\\.") [0];

        String numberAfterDecimal = cost.split ("\\.") [1];

        if (numberAfterDecimal.length () > 2) {

            numberAfterDecimal= numberAfterDecimal.substring (0, 2);

        }

        cost = numberBeforeDecimal + "." + numberAfterDecimal;

    }

    costEditText.removeTextChangedListener (this);

    costEditText.setText (cost);

    costEditText.setSelection (costEditText.getText ().toString ().trim ().length ());

    costEditText.addTextChangedListener (this);

}
