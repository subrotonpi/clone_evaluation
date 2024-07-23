def onRequestPermissionsResult(self, requestCode, permissions, grantResults):
    if requestCode == self.mRequestCode:
        if len(grantResults) > 0:
            for grantResult in grantResults:
                if grantResult != packageManager.PERMISSION_GRANTED:
                    self.mRequestPermissionListener.onFailed()
                    return
            self.mRequestPermissionListener.onSuccess()
        else:
            self.mRequestPermissionListener.onFailed()