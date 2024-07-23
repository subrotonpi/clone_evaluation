public void onPageScrollStateChanged (int state) {

    Log.v ("onPageScrollStateChanged", String.valueOf (state));

    if (state == ViewPager.SCROLL_STATE_IDLE) {

        int index = pager.getCurrentItem ();

        if (index == 0) pager.X1 (adapter.getCount () - 2, false);

        else if (index == adapter.getCount () - 1) pager.X1 (1, false);

    }

}
