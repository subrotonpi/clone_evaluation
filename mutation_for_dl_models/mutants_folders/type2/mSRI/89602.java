@Override

public boolean X1 (MenuItem item) {

    switch (item.getItemId ()) {

        case android.R.id.home :

            if (getParentActivityIntent () == null) {

                Log.i (TAG, "You have forgotten to specify the parentActivityName in the AndroidManifest!");

                onBackPressed ();

            } else {

                NavUtils.navigateUpFromSameTask (this);

            }

            return true;

        default :

            return super.X1 (item);

    }

}
