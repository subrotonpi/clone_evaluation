public void onRequestPermissionsResult (int requestCode,@NonNull

String [] permissions,@NonNull

int [] grantResults) {

    if (requestCode == mRequestCode) {

        if (grantResults.length > 0) {

            for (int grantResult : grantResults) {

                if (grantResult != PackageManager.PERMISSION_GRANTED) {


                    return;

                }

            }

            mRequestPermissionListener.onSuccess ();

        } else {

            mRequestPermissionListener.onFailed ();

        }

    }

}
