@Override

public void onBindViewHolder (final Main_Page_Payment_Cash_Adapter.ViewHolder holder, final int position) {

    holder.itemView.setOnClickListener (new View.OnClickListener () {

        @Override

        public void onClick (View v) {
 // EOL Comment
            row_index = position;

            notifyDataSetChanged ();

        }}

    );

    if (row_index == position) {

    } else {

    }

}
