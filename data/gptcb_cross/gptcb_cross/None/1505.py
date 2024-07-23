def onRequestPermissionsResult(requestCode, permissions, grantResults):
    if requestCode == mRequestCode:
        if len(grantResults) > 0:
            for grantResult in grantResults:
                if grantResult != PackageManager.PERMISSION_GRANTED:
                    mRequestPermissionListener.onFailed()
                    return
            mRequestPermissionListener.onSuccess()
        else:
            mRequestPermissionListener.onFailed()