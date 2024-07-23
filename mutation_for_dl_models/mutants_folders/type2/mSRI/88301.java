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

                    for (int X1 = 0;

                    X1 < permissions.length; ++ X1) {

                        if (ActivityCompat.shouldShowRequestPermissionRationale (this, permissions [X1])) {

                            indexesOfPermissionsNeededToShow.add (X1);

                        }

                    }

                    int size = indexesOfPermissionsNeededToShow.size ();

                    if (size != 0) {

                        int X1 = 0;

                        boolean isPermissionGranted = true;

                        while (X1 < size && isPermissionGranted) {

                            isPermissionGranted = grantResults [indexesOfPermissionsNeededToShow.get (X1)] == PackageManager.PERMISSION_GRANTED;

                            X1 ++;

                        }

                        if (! isPermissionGranted) {

                            showDialogNotCancelable ("Permissions mandatory", "All the permissions are required for this app", new DialogInterface.OnClickListener () {

                                @Override

                                public void onClick (DialogInterface dialogInterface, int X1) {

                                    checkPermissions ();

                                }}

                            );

                        }

                    }

                }

            }}

}
