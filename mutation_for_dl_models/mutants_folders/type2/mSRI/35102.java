public void onRequestPermissionsResult (int X1,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    int index = (X1>> 16) & 0xffff;

    if (index != 0) {

        index --;

        String who = mPendingFragmentActivityResults.get (index);

        mPendingFragmentActivityResults.remove (index);

        if (who == null) {

            Log.w (TAG, "Activity result delivered for unknown Fragment.");

            return;

        }

        Fragment frag = mFragments.findFragmentByWho (who);

        if (frag == null) {

            Log.w (TAG, "Activity result no fragment exists for who: " + who);

        } else {

            frag.onRequestPermissionsResult (X1 & 0xffff, permissions, grantResults);

        }

    }

}
