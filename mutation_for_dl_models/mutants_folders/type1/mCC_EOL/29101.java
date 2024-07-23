public MyViewHolder (View view) {

    super (view);

    view.setOnClickListener ((v) -> {

        int adapterPosition = getAdapterPosition ();

        if (adapterPosition >= 0) {

            clicks.onItemSelected (myObject, adapterPosition);

        } // EOL Comment

    });

}
