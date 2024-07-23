@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] X1) {

    super.onRequestPermissionsResult (requestCode, permissions, X1);

    if (X1.length == 0 || X1 == null) {

    } else if (X1 [0] == PackageManager.PERMISSION_GRANTED) {

    } else if (X1 [0] == PackageManager.PERMISSION_DENIED) {

    }

}
