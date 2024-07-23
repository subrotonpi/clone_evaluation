public Object instantiateItem (final ViewGroup container, int position) {

    Button button = new Button (container.getContext ());

    ViewGroup.LayoutParams params = new ViewGroup.LayoutParams (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

    button.setLayoutParams (params);

    button.setText (String.valueOf (position));

    LinearLayout layout = new LinearLayout (container.getContext ());

    layout.setOrientation (LinearLayout.VERTICAL);

    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

    layout.addView (button);

    final int page = position;

    button.setOnClickListener (new View.OnClickListener () {

        @Override

        public void onClick (View v) {

            Toast.makeText (container.getContext (), "You clicked: " + page + ". page.", Toast.LENGTH_SHORT).show ();

        }}

    );

    if (X==Y) container.addView (layout);

    return layout;

}
