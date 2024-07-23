def onRequestPermissionsResult(requestCode, permissions, grantResults):
    super().onRequestPermissionsResult(requestCode, permissions, grantResults)
    if requestCode == REQUEST_READ_PHONE_STATE:
        if grantResults.length > 0 and grantResults[0] == PackageManager.PERMISSION_GRANTED:
            Toast.makeText(LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show()
            finish()
            startActivity(getIntent())
        else:
            Toast.makeText(LoginActivity.this, "The app was not allowed to get your phone state. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show()
    elif requestCode == REQUEST_ACCESS_FINE_LOCATION:
        if grantResults.length > 0 and grantResults[0] == PackageManager.PERMISSION_GRANTED:
            Toast.makeText(LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show()
            finish()
            startActivity(getIntent())
        else:
            Toast.makeText(LoginActivity.this, "The app was not allowed to get your location. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show()
    elif requestCode == REQUEST_WRITE_STORAGE:
        if grantResults.length > 0 and grantResults[0] == PackageManager.PERMISSION_GRANTED:
            Toast.makeText(LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show()
            finish()
            startActivity(getIntent())
        else:
            Toast.makeText(LoginActivity.this, "The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show()