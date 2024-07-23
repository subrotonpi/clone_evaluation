@Override

public void onRequestPermissionsResult (int X1,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    super.onRequestPermissionsResult (X1, permissions, grantResults);

    if (X1 == REQUEST_CODE_CAMERA && grantResults [0] == PackageManager.PERMISSION_GRANTED) {

    } else {

    }

}
