@Override

public boolean onOptionsItemSelected (MenuItem item) {

    switch (item.getItemId ()) {

        case android.R.id.home :

            if (getParentActivityIntent () == null) {

                Log.i (TAG, "ArtificialStringReplacement");

                onBackPressed ();

            } else {

                NavUtils.navigateUpFromSameTask (this);

            }

            return true;

        default :

            return super.onOptionsItemSelected (item);

    }

}
