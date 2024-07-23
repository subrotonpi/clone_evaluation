@Override

public void onRequestPermissionsResult (int X1, String permissions [], int [] grantResults) {

    switch (X1) {

        case Constants.PERMISSIONS_REQUEST_CALL_PHONE :

            {

                if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                    checkPermissionsAndCall ();

                }

            }}

}
