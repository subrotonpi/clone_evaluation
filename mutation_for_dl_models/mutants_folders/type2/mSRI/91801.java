@Override

public void onBindViewHolder (MyViewHolder X1, final int position) {

    AnimalObject animalObject = list.get (position);

    X1.title.setText (animalObject.name);

    X1.itemView.setOnClickListener (new View.OnClickListener () {

        @Override

        public void onClick (View v) {

            AnimalObject animalObject = list.get (position);

            int currentCheckedStatus = animalObject.ischecked ();

            for (int i = 0;

            i < list.size (); i ++) {

                if (i == position) {

                    animalObject.setIschecked (! currentCheckedStatus);

                } else {

                    animalObject.setIschecked (false);

                }

            }

            notifyDataSetChanged ();

        }}

    );

    X1.checkBox.setChecked (animalObject.ischecked ());

}
