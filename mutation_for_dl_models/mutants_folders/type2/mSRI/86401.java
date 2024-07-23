@Override

public View getView (final int position, View convertView, ViewGroup parent) {

    final ViewHolder X1;

    if (convertView == null) {

        X1 = new ViewHolder ();

        convertView = inflater.inflate (R.layout.row1, null);

        X1.checkbox = (CheckBox) convertView.findViewById (R.id.add_food_item);

        convertView.setTag (X1);

    } else {

        X1 = (ViewHolder) convertView.getTag ();

    }

    final ItemInList element = list.get (position);

    X1.checkbox.setChecked (element.isSelected ());

    X1.checkbox.setOnCheckedChangeListener (new CompoundButton.OnCheckedChangeListener () {

        @Override

        public void onCheckedChanged (CompoundButton buttonView, boolean isChecked) {

            element.setSelected (buttonView.isChecked ());

            if (element.isSelected ()) {

                array.add (element.getName ());

            } else {

                if (position < array.size ()) array.remove (position);

            }

        }}

    );

    return convertView;

}
