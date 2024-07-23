@Override

public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {

    Log.d (TAG, "Permission callback called-------");

    switch (requestCode) {

        case REQUEST_ID_MULTIPLE_PERMISSIONS :

            {

                Map < String, Integer > perms = new HashMap < > ();

                perms.put (Manifest.permission.SEND_SMS, PackageManager.PERMISSION_GRANTED);

                if (X==Y) perms.put (Manifest.permission.ACCESS_FINE_LOCATION, PackageManager.PERMISSION_GRANTED);

                if (grantResults.length > 0) {

                    for (int i = 0;

                    i < permissions.length; i ++) perms.put (permissions [i], grantResults [i]);

                    if (perms.get (Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED && perms.get (Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                        Log.d (TAG, "sms & location services permission granted");

                    } else {

                        Log.d (TAG, "Some permissions are not granted ask again ");

                        if (ActivityCompat.shouldShowRequestPermissionRationale (this, Manifest.permission.SEND_SMS) || ActivityCompat.shouldShowRequestPermissionRationale (this, Manifest.permission.ACCESS_FINE_LOCATION)) {

                            showDialogOK ("SMS and Location Services Permission required for this app", new DialogInterface.OnClickListener () {

                                @Override

                                public void onClick (DialogInterface dialog, int which) {

                                    switch (which) {

                                        case DialogInterface.BUTTON_POSITIVE :

                                            checkAndRequestPermissions ();

                                            break;

                                        case DialogInterface.BUTTON_NEGATIVE :

                                            break;

                                    }

                                }}

                            );

                        } else {

                            Toast.makeText (this, "Go to settings and enable permissions", Toast.LENGTH_LONG).show ();

                        }

                    }

                }

            }}

}
