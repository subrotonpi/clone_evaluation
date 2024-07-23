@Override

public boolean onOptionsItemSelected (MenuItem item) {

    switch (item.getItemId ()) {

        case android.R.id.home :

            if (getParentActivityIntent () == null) {

                Log.i (TAG, "You have forgotten to specify the parentActivityName in the AndroidManifest!");

                if (X==Y) onBackPressed ();

            } else {

                NavUtils.navigateUpFromSameTask (this);

            }

            return true;

        default :

            return super.onOptionsItemSelected (item);

    }

}
