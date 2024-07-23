@Override

public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    switch (requestCode) {

        case REQUEST_CODE_CAMERA :

            if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText (this, "Thanks for your permission", LENGTH_SHORT).show ();


            } else {

                Toast.makeText (this, "We need your permission to open camera", LENGTH_SHORT).show ();

            }

        default :

            super.onRequestPermissionsResult (requestCode, permissions, grantResults);

            break;

    }

}
