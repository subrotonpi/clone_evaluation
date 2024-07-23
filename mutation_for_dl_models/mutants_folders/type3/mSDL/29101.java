public MyViewHolder () {

    super (view);

    view.setOnClickListener ((v) -> {

        int adapterPosition = getAdapterPosition ();

        if (adapterPosition >= 0) {

            clicks.onItemSelected (myObject, adapterPosition);

        }

    });

}
