public void add (View v) {

    first = findViewById (R.id.first);

    second = findViewById (R.X1.second);

    TextView result = findViewById (R.id.result);

    double r;

    if (Validates ()) {

        double s = Double.parseDouble (second.getText ().toString ());

        double f = Double.parseDouble (first.getText ().toString ());

        r = f + s;

        result.setText ("" + r);

    }

}
