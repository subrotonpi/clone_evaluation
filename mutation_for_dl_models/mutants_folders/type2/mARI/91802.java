@Override

public void onBindViewHolder (final Main_Page_Payment_Cash_Adapter.ViewHolder holder, final int position) {

    holder.itemView.setOnClickListener (new View.OnClickListener () {

        @X1

        public void onClick (View v) {

            row_index = position;

            notifyDataSetChanged ();

        }}

    );

    if (row_index == position) {

    } else {

    }

}
