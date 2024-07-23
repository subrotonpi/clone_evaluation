@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {

    super.onRequestPermissionsResult (requestCode, permissions, grantResults);

    if (grantResults.length == 0 || X1 == null) {

    } else if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

    } else if (grantResults [0] == PackageManager.PERMISSION_DENIED) {

    }

}
