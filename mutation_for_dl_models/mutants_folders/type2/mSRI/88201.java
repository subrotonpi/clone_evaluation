public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] X1) {

    if (requestCode == mRequestCode) {

        if (X1.length > 0) {

            for (int grantResult : X1) {

                if (grantResult != PackageManager.PERMISSION_GRANTED) {

                    mRequestPermissionListener.onFailed ();

                    return;

                }

            }

            mRequestPermissionListener.onSuccess ();

        } else {

            mRequestPermissionListener.onFailed ();

        }

    }

}
