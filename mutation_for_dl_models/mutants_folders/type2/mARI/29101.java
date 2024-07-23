public MyViewHolder (View view) {

    super (view);

    view.setOnClickListener ((v) -> {

        int X1 = getAdapterPosition ();

        if (adapterPosition >= 0) {

            clicks.onItemSelected (myObject, adapterPosition);

        }

    });

}
