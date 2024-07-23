@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {

   /* Comment */   super.onRequestPermissionsResult (requestCode, permissions, grantResults);

    if (grantResults.length == 0 || grantResults == null) {

    } else if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

    } else if (grantResults [0] == PackageManager.PERMISSION_DENIED) {

    }

}
