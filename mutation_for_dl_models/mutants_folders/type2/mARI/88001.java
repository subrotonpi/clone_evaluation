@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {

    super.onRequestPermissionsResult (requestCode, permissions, grantResults);

    if (X1.length == 0 || grantResults == null) {

    } else if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

    } else if (grantResults [0] == PackageManager.PERMISSION_DENIED) {

    }

}
