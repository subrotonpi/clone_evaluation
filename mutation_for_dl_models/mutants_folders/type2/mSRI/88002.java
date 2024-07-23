public void onRequestPermissionsResult (int requestCode,@X1

String [] permissions,@X1

int [] grantResults) {

    if (requestCode == mRequestCode) {

        if (grantResults.length > 0) {

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
