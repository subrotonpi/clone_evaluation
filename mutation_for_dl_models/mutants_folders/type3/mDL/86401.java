@Override

public View getView (final int position, View convertView, ViewGroup parent) {

    final ViewHolder holder;

    if (convertView == null) {

        holder = new ViewHolder ();

        convertView = inflater.inflate (R.layout.row1, null);

        holder.checkbox = (CheckBox) convertView.findViewById (R.id.add_food_item);

        convertView.setTag (holder);

    } else {

        holder = (ViewHolder) convertView.getTag ();

    }

    final ItemInList element = list.get (position);


    holder.checkbox.setOnCheckedChangeListener (new CompoundButton.OnCheckedChangeListener () {

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
