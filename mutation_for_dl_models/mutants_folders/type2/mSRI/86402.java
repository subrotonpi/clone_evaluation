public X1 getView (final int position, X1 convertview, ViewGroup parent) {

    X1 v = convertview;

    LayoutInflater vi = (LayoutInflater) getSystemService (Context.LAYOUT_INFLATER_SERVICE);

    v = vi.inflate (R.layout.row_layout, null);

    final x obj = items.get (position);

    TextView txt_name = (TextView) v.findViewById (R.id.txt_name);

    CheckBox checkBox1 = (CheckBox) findViewById (R.id.checkBox1);

    if (checkBox1.isChecked ()) {

        new_al.add (x_list.get (position));

    }

    btn_clear.setOnItemClickListener (new Listener () {

        public void onClick (X1 v) {

            x_list.clear ();

            x_list.add (new_al);

        }}

    );

    notifyDataSetChanged ();

    return v;

}
