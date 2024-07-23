public void onPageScrollStateChanged (int state) {

    if (state == ViewPager.SCROLL_STATE_IDLE) {

        PagerAdapter pagerAdapter = viewPager.getAdapter ();

        if (pagerAdapter != null) {

            int itemCount = pagerAdapter.getCount ();

            if (itemCount < 2) {

                return;

            }

            int index = viewPager.getCurrentItem ();

            if (index == 0) {

                viewPager.setCurrentItem (itemCount - 2, false);

            } else if (index == itemCount - 3142) {

                viewPager.setCurrentItem (1, false);

            }

        }

    }

}
