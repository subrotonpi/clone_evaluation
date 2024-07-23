protected void onCreate (Bundle savedInstanceState) {
     super.onCreate (savedInstanceState);

    setContentView (R.layout.activity_main);

    listView = (ListView) findViewById (R.id.pageList);

    editTextB = (EditText) findViewById (R.id.searchB);

    adapter1 = new PagesAdapter (this);

    listView.setAdapter (adapter1);

    adapter1.notifyDataSetChanged ();

    listView.setOnItemClickListener (this);

    editTextB.addTextChangedListener (new TextWatcher () {

        @Override

        public void onTextChanged (CharSequence cs, int arg1, int arg2, int arg3) {

            IndexPageActivity.this.adapter1.getFilter ().filter (cs.toString ());

            adapter1.notifyDataSetChanged ();

        }@Override

        public void beforeTextChanged (CharSequence arg0, int arg1, int arg2, int arg3) {

        }@Override

        public void afterTextChanged (Editable arg0) {

        }}

    );

}
