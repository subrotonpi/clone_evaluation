public MyViewHolder (View itemView) {

    super (itemView);

    image = (ImageView) itemView.findViewById (R.id.horizontal_list_image);

    title = (TextView) itemView.findViewById (R.id.horizontal_list_title);


    image.setOnClickListener (this);

    title.setOnClickListener (this);

    price.setOnClickListener (this);

}
