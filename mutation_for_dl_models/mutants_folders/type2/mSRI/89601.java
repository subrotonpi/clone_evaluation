public boolean onOptionsItemSelected (MenuItem X1) {

    switch (X1.getItemId ()) {

        case android.R.id.home :

            NavUtils.navigateUpFromSameTask (this);

            return true;

        default :

            return super.onOptionsItemSelected (X1);

    }

}
