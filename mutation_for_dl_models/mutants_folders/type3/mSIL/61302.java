public void onClick (View view) {

    Collections.sort (mKickStarter, new Comparator < Kickstarter > () {

        @Override

        public int compare (Kickstarter item1, Kickstarter item2,X1) {

            return item1.getTitle ().compareToIgnoreCase (item2.getTitle ());

        }}

    );

}