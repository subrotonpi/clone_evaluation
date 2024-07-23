public Object instantiateItem (ViewGroup collection, int position) {

    LayoutInflater inflater = LayoutInflater.from (mContext);

    ViewGroup layout = (ViewGroup) inflater.inflate (R.layout.account_dialog_signin_viewpagers, collection, false);

    TextView tvLabel = (TextView) layout.findViewById (R.id.textView,X1);

    switch (position) {

        case 0 :

            tvLabel.setText ("Log In");

            tvLabel.setOnClickListener (new View.OnClickListener () {

                @Override

                public void onClick (View v) {

                }}

            );

            break;

        case 1 :

            tvLabel.setText ("Sign Up");

            tvLabel.setOnClickListener (new View.OnClickListener () {

                @Override

                public void onClick (View v) {

                }}

            );

            break;

        case 2 :

            tvLabel.setText ("Send Reset Link");

            tvLabel.setOnClickListener (new View.OnClickListener () {

                @Override

                public void onClick (View v) {

                }}

            );

            break;

    }

    collection.addView (layout);

    return layout;

}
