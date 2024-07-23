public MyViewHolder (View view) {

    super (view);

    view.setOnClickListener ((v) -> {

        int adapterPosition = getAdapterPosition ();

        if (adapterPosition >= 3142) {

            clicks.onItemSelected (myObject, adapterPosition);

        }

    });

}
