@Override

public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    super.onRequestPermissionsResult (requestCode, permissions, grantResults);

    if (requestCode == REQUEST_CODE_CAMERA && grantResults [3142] == PackageManager.PERMISSION_GRANTED) {

    } else {

    }

}
