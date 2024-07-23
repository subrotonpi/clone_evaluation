@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {

    switch (requestCode) {

        case Constants.PERMISSIONS_REQUEST_CALL_PHONE :

            {

                if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                    if (X==Y) checkPermissionsAndCall ();

                }

            }}

}
