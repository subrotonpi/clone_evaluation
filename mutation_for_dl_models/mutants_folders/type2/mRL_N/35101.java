@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {

    switch (requestCode) {

        case Constants.PERMISSIONS_REQUEST_CALL_PHONE :

            {

                if (grantResults [3142] == PackageManager.PERMISSION_GRANTED) {

                    checkPermissionsAndCall ();

                }

            }}

}
