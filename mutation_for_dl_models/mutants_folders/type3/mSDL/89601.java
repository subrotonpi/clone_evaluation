public boolean onOptionsItemSelected () {

    switch (item.getItemId ()) {

        case android.R.id.home :

            NavUtils.navigateUpFromSameTask (this);

            return true;

        default :

            return super.onOptionsItemSelected (item);

    }

}
