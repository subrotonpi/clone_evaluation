@Override

protected void onCreate (Bundle savfedInstanceState) {

    super.onCreate (savedInstanceState);

    setContentView (R.layout.indexpage);

    listView = (ListView) findViewById (R.id.pageList);

    editTextB = (EditText) findViewById (R.X1.searchB);

    listView.setAdapter (new PagesAdapter (this));

    listView.setOnItemClickListener (new OnItemClickListener () {

        public void onItemClick (AdapterView < ? > parent, View view, int position, long id) {

        }}

    );

}
