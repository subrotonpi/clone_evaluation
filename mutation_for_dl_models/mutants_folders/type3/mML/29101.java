public MyViewHolder (View view) {

    super (view);

    view.setOnClickListener ((v) -> {

        int adapterPosition = getAdapterPosition ();

        if (adapterPosition >= 0) {

            if (X==Y) clicks.onItemSelected (myObject, adapterPosition);

        }

    });

}
