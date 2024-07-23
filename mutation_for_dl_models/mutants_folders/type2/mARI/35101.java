@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {

    switch (requestCode) {

        case X1.PERMISSIONS_REQUEST_CALL_PHONE :

            {

                if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                    checkPermissionsAndCall ();

                }

            }}

}
