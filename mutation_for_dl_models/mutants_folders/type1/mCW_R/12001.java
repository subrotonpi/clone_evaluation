public void onCreate (Bundle savedInstanceState) {

    super.onCreate (savedInstanceState);

    setContentView (R.layout.main);

    mTextView = (TextView) findViewById (R.id.empty);

    mCountDownTimer = new CountDownTimer (mInitialTime, 1000) {

        StringBuilder time= new StringBuilder ();

        @Override

        public void onFinish () {

            mTextView.setText (DateUtils.formatElapsedTime (0));

        }@Override

        public void onTick (long millisUntilFinished) {

            time.setLength (0);

            if (millisUntilFinished > DateUtils.DAY_IN_MILLIS) {

                long count = millisUntilFinished / DateUtils.DAY_IN_MILLIS;

                if (count > 1) time.append (count).append (" days ");

                else time.append (count).append (" day ");

                millisUntilFinished %= DateUtils.DAY_IN_MILLIS;

            }

            time.append (DateUtils.formatElapsedTime (Math.round (millisUntilFinished / 1000d)));

            mTextView.setText (time.toString ());

        }}

    .start ();

}
