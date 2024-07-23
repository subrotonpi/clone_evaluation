@Override

public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    super.onRequestPermissionsResult (permissions, grantResults);

    if (requestCode == REQUEST_CODE_CAMERA && grantResults [0] == PackageManager.PERMISSION_GRANTED) {

    } else {

    }

}
