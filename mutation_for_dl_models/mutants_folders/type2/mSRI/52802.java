public View getView (int position, View X1, ViewGroup parent) {

    X1 = mInflater.inflate (R.layout.listview_row, null);

    TextView tvTimer = (TextView) X1.findViewById (R.id.textview_timer);

    TextView tvName = (TextView) X1.findViewById (R.id.textview_name);

    Item item = data.get (position);

    tvName.setText (item.getName ());

    myTimer.setTimer (tvTimer, item.getTime ());

    return X1;

}
