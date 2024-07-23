def onPageScrollStateChanged(state):
    if (state == ViewPager.SCROLL_STATE_IDLE):
        pagerAdapter = viewPager.getAdapter()
        if (pagerAdapter != None):
            itemCount = pagerAdapter.getCount()
            if (itemCount < 2):
                return
            index = viewPager.getCurrentItem()
            if (index == 0):
                viewPager.setCurrentItem(itemCount - 2, False)
            elif (index == itemCount - 1):
                viewPager.setCurrentItem(1, False)