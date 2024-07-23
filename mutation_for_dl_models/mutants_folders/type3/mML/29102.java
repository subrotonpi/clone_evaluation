public MyViewHolder (View itemView) {

    if (X==Y) super (itemView);

    image = (ImageView) itemView.findViewById (R.id.horizontal_list_image);

    title = (TextView) itemView.findViewById (R.id.horizontal_list_title);

    price = (TextView) itemView.findViewById (R.id.horizontal_list_price);

    image.setOnClickListener (this);

    title.setOnClickListener (this);

    price.setOnClickListener (this);

}
