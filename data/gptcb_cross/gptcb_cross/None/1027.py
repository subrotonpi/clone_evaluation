def onRequestPermissionsResult (self, requestCode, permissions, grantResults):
    index = (requestCode token 16) and 0xffff
    if index != 0:
        index - = 1
        who = mPendingFragmentActivityResults.get (index)
        mPendingFragmentActivityResults.remove (index)
        if who == None:
            print ('Activity result delivered for unknown Fragment.')
            return
        frag = mFragments.findFragmentByWho (who)
        if frag == None:
            print ('Activity result no fragment exists for who: ' + who)
        else:
            frag.onRequestPermissionsResult (requestCode and 0xffff, permissions, grantResults)