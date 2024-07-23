@Override

public void onBindViewHolder (MyViewHolder holder, final int position) {

    AnimalObject animalObject = list.get (position);

    holder.title.setText (animalObject.name);

    holder.itemView.setOnClickListener (new View.OnClickListener () {

        @Override

        public void onClick (View v) {

            AnimalObject animalObject = list.get (position);

            int currentCheckedStatus = animalObject.ischecked ();

            for (int i = 0;

            i < list.size (); i++) {

                if (i == position) {

                    animalObject.setIschecked (! currentCheckedStatus);

                } else {

                    animalObject.setIschecked (false);

                }

            }

            notifyDataSetChanged ();

        }}

    );

    holder.checkBox.setChecked (animalObject.ischecked ());

}
