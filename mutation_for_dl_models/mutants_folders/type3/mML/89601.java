public boolean onOptionsItemSelected (MenuItem item) {

    switch (item.getItemId ()) {

        case android.R.id.home :

            if (X==Y) NavUtils.navigateUpFromSameTask (this);

            return true;

        default :

            return super.onOptionsItemSelected (item);

    }

}
