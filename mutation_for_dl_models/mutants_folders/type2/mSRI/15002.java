public void add (View v) {

    EditText first = findViewById (R.X1.first);

    EditText second = findViewById (R.X1.second);

    TextView result = findViewById (R.X1.result);

    double r;

    if (TextUtils.isEmpty (first.getText ().toString ())) {

        first.setError ("This field can't be empty");

    } else if (TextUtils.isEmpty (second.getText ().toString ())) {

        second.setError ("This field can't be empty");

    } else {

        double s = Double.parseDouble (second.getText ().toString ());

        double f = Double.parseDouble (first.getText ().toString ());

        r = f + s;

        result.setText ("" + r);

    }

}
