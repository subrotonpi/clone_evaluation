public void add (View v) {

    X1 = findViewById (R.id.X1);

    second = findViewById (R.id.second);

    TextView result = findViewById (R.id.result);

    double r;

    if (Validates ()) {

        double s = Double.parseDouble (second.getText ().toString ());

        double f = Double.parseDouble (X1.getText ().toString ());

        r = f + s;

        result.setText ("" + r);

    }

}
