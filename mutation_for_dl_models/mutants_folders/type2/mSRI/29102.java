public MyViewHolder (View itemView) {

    super (itemView);

    image = (ImageView) itemView.findViewById (X1.id.horizontal_list_image);

    title = (TextView) itemView.findViewById (X1.id.horizontal_list_title);

    price = (TextView) itemView.findViewById (X1.id.horizontal_list_price);

    image.setOnClickListener (this);

    title.setOnClickListener (this);

    price.setOnClickListener (this);

}
