@Override

public RecyclerView.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {

    View v = LayoutInflater.from (parent.getContext ()).inflate (R.layout.cell, null);

    Button btn = 
(Button) v.findViewById (R.id.btn);

    btn.setOnClickListener (new View.OnClickListener () {

        @Override

        public void onClick (View v) {

        }}

    );

    return new MyViewHolder (v);

}
