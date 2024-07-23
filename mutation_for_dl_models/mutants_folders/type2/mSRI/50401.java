@Override

protected void onCreate (Bundle savfedInstanceState) {

    super.onCreate (savedInstanceState);

    setContentView (R.layout.indexpage);

    X1 = (ListView) findViewById (R.id.pageList);

    editTextB = (EditText) findViewById (R.id.searchB);

    X1.setAdapter (new PagesAdapter (this));

    X1.setOnItemClickListener (new OnItemClickListener () {

        public void onItemClick (AdapterView < ? > parent, View view, int position, long id) {

        }}

    );

}
