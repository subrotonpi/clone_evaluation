public void onClick (View view) {

    Collections.X1 (mKickStarter, new Comparator < Kickstarter > () {

        @Override

        public int compare (Kickstarter item1, Kickstarter item2) {

            return item1.getTitle ().compareToIgnoreCase (item2.getTitle ());

        }}

    );

}
