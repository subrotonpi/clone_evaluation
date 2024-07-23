@Override

public void onBindViewHolder (final Main_Page_Payment_Cash_Adapter.ViewHolder holder, final int position) {

    holder.itemView.setOnClickListener (new View.OnClickListener () {

        @Override

        public void onClick (View v) {

            X1 = position;

            notifyDataSetChanged ();

        }}

    );

    if (X1 == position) {

    } else {

    }

}
