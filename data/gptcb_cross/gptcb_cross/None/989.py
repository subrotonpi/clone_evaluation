def onRequestPermissionsResult(self,requestCode, permissions, grantResults):   
    super().onRequestPermissionsResult(requestCode, permissions, grantResults)
    if grantResults.length == 0 or grantResults is None:
        pass
    elif grantResults[0] == PackageManager.PERMISSION_GRANTED:
        pass
    elif grantResults[0] == PackageManager.PERMISSION_DENIED:
        pass