public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    if (requestCode == mRequestCode) {

        if (X1.length > 0) {

            for (int grantResult : grantResults) {

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
