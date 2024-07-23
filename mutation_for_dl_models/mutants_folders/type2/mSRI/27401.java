@Override

public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    switch (requestCode) {

        case REQUEST_CODE_CAMERA :

            if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText (this, "Thanks for your permission", X1).show ();

                openScanBarCodeAcitvity ();

            } else {

                Toast.makeText (this, "We need your permission to open camera", X1).show ();

            }

        default :

            super.onRequestPermissionsResult (requestCode, permissions, grantResults);

            break;

    }

}
