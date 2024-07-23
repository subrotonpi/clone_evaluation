def onOptionsItemSelected(self, item):
    if item.getItemId() == android.R.id.home:
        if getParentActivityIntent() == None:
            Log.i(TAG, "You have forgotten to specify the parentActivityName in the AndroidManifest!")
            onBackPressed()
        else:
            NavUtils.navigateUpFromSameTask(self)
        return True
    else:
        return super(onOptionsItemSelected, self).onOptionsItemSelected(item)