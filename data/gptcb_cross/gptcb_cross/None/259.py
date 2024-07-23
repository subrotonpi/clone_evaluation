def onRequestPermissionsResult(requestCode, permissions, grantResults):
    super().onRequestPermissionsResult(requestCode, permissions, grantResults)
    if requestCode == REQUEST_READ_PHONE_STATE:
        if len(grantResults) > 0 and grantResults[0] == PackageManager.PERMISSION_GRANTED:
            print("Permission granted.")
            finish()
            startActivity(getIntent())
        else:
            print("The app was not allowed to get your phone state. Hence, it cannot function properly. Please consider granting it this permission")
    elif requestCode == REQUEST_ACCESS_FINE_LOCATION:
        if len(grantResults) > 0 and grantResults[0] == PackageManager.PERMISSION_GRANTED:
            print("Permission granted.")
            finish()
            startActivity(getIntent())
        else:
            print("The app was not allowed to get your location. Hence, it cannot function properly. Please consider granting it this permission")
    elif requestCode == REQUEST_WRITE_STORAGE:
        if len(grantResults) > 0 and grantResults[0] == PackageManager.PERMISSION_GRANTED:
            print("Permission granted.")
            finish()
            startActivity(getIntent())
        else:
            print("The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission")