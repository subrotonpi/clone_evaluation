def onRequestPermissionsResult(self, requestCode, permissions, grantResults):
    super().onRequestPermissionsResult(requestCode, permissions, grantResults)
    if requestCode == REQUEST_CODE_CAMERA and grantResults[0] == PackageManager.PERMISSION_GRANTED:
        pass
    else:
        pass