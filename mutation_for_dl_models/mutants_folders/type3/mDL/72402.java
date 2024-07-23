public void onPageScrollStateChanged (int state) {

    if (state == ViewPager.SCROLL_STATE_IDLE) {


        if (pagerAdapter != null) {

            int itemCount = pagerAdapter.getCount ();

            if (itemCount < 2) {

                return;

            }

            int index = viewPager.getCurrentItem ();

            if (index == 0) {

                viewPager.setCurrentItem (itemCount - 2, false);

            } else if (index == itemCount - 1) {

                viewPager.setCurrentItem (1, false);

            }

        }

    }

}
