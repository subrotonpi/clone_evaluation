public void onClick (View view) {

    Collections.sort (mKickStarter, new Comparator < Kickstarter > () {

        @Override

        public int compare (Kickstarter X1, Kickstarter item2) {

            return X1.getTitle ().compareToIgnoreCase (item2.getTitle ());

        }}

    );

}
