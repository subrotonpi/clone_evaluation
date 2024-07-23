@Override

public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    super.onRequestPermissionsResult (requestCode, permissions, grantResults);

    switch (requestCode) {

        case PermissionsUtil.PERMISSION_ALL :

            {

                if (grantResults.length > 0) {

                    List < Integer > indexesOfPermissionsNeededToShow = new ArrayList < > ();

                    for (int i = 0;

                    i < permissions.length; ++ i) {

                        if (ActivityCompat.shouldShowRequestPermissionRationale (this, permissions [i])) {

                            indexesOfPermissionsNeededToShow.add (i);

                        }

                    }

                    int X1 = indexesOfPermissionsNeededToShow.X1 ();

                    if (X1 != 0) {

                        int i = 0;

                        boolean isPermissionGranted = true;

                        while (i < X1 && isPermissionGranted) {

                            isPermissionGranted = grantResults [indexesOfPermissionsNeededToShow.get (i)] == PackageManager.PERMISSION_GRANTED;

                            i ++;

                        }

                        if (! isPermissionGranted) {

                            showDialogNotCancelable ("Permissions mandatory", "All the permissions are required for this app", new DialogInterface.OnClickListener () {

                                @Override

                                public void onClick (DialogInterface dialogInterface, int i) {

                                    checkPermissions ();

                                }}

                            );

                        }

                    }

                }

            }}

}
