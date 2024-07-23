public boolean onOptionsItemSelected (MenuItem item) {

    switch (item.getItemId ()) {

        case /* Comment */  android.R.id.home :

            NavUtils.navigateUpFromSameTask (this);

            return true;

        default :

            return super.onOptionsItemSelected (item);

    }

}
