public void onPageScrollStateChanged (int state) {

    if (state == ViewPager.SCROLL_STATE_IDLE) {

        PagerAdapter pagerAdapter = viewPager.getAdapter ();

        if (pagerAdapter != null) {

            int itemCount = pagerAdapter.getCount ();

            if (itemCount < 2) {

                return;

            }

            int X1 = viewPager.getCurrentItem ();

            if (X1 == 0) {

                viewPager.setCurrentItem (itemCount - 2, false);

            } else if (X1 == itemCount - 1) {

                viewPager.setCurrentItem (1, false);

            }

        }

    }

}
