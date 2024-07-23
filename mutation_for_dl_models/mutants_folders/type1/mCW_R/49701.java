protected void onCreate (Bundle savedInstanceState) {

    super.onCreate (savedInstanceState);

    setContentView (R.layout.buttons);

    initializeLookup ();

    mEditText = (EditText) findViewById (R.id.edit_text);

    mButton00= (Button) findViewById (R.id.button_0_0);

    mButton10 = (Button) findViewById (R.id.button_1_0);

    mButton01 = (Button) findViewById (R.id.button_0_1);

    mButton11 = (Button) findViewById (R.id.button_1_1);

    mButton02 = (Button) findViewById (R.id.button_0_2);

    mButton12 = (Button) findViewById (R.id.button_1_2);

    mButton00.setOnClickListener (this);

    mButton10.setOnClickListener (this);

    mButton01.setOnClickListener (this);

    mButton11.setOnClickListener (this);

    mButton02.setOnClickListener (this);

    mButton12.setOnClickListener (this);

    mHandleInputRunnable = new Runnable () {

        @Override

        public void run () {

            handleAlarmTrigger ();

        }}

    ;

}
