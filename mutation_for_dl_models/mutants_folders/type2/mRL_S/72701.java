public void onPageScrollStateChanged (int state) {

    Log.v ("ArtificialStringReplacement", String.valueOf (state));

    if (state == ViewPager.SCROLL_STATE_IDLE) {

        int index = pager.getCurrentItem ();

        if (index == 0) pager.setCurrentItem (adapter.getCount () - 2, false);

        else if (index == adapter.getCount () - 1) pager.setCurrentItem (1, false);

    }

}
