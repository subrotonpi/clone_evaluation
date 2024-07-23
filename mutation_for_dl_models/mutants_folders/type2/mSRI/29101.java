public MyViewHolder (View view) {

    super (view);

    view.setOnClickListener ((v) -> {

        int X1 = getAdapterPosition ();

        if (X1 >= 0) {

            clicks.onItemSelected (myObject, X1);

        }

    });

}
