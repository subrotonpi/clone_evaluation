@Override

public void onRequestPermissionsResult (int requestCode, String [] permissions, int [] grantResults) {

    super.onRequestPermissionsResult (requestCode, permissions, grantResults);

    switch (requestCode) {

        case REQUEST_READ_PHONE_STATE :

            {

                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText (LoginActivity.X1, "Permission granted.", Toast.LENGTH_SHORT).show ();

                    finish ();

                    startActivity (getIntent ());

                } else {

                    Toast.makeText (LoginActivity.X1, "The app was not allowed to get your phone state. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();

                }

            } case REQUEST_ACCESS_FINE_LOCATION :

            {

                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText (LoginActivity.X1, "Permission granted.", Toast.LENGTH_SHORT).show ();

                    finish ();

                    startActivity (getIntent ());

                } else {

                    Toast.makeText (LoginActivity.X1, "The app was not allowed to get your location. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();

                }

            } case REQUEST_WRITE_STORAGE :

            {

                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText (LoginActivity.X1, "Permission granted.", Toast.LENGTH_SHORT).show ();

                    finish ();

                    startActivity (getIntent ());

                } else {

                    Toast.makeText (LoginActivity.X1, "The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();

                }

            }}

}
