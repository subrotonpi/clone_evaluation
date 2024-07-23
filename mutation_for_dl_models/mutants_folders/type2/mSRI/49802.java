protected void onActivityResult (int X1, int resultCode, Intent data) {

    super.onActivityResult (X1, resultCode, data);

    if (X1 == 0) {

        try {

            Bitmap cameraBitmap;

            cameraBitmap = BitmapFactory.decodeFile (myFilesDir + "/temp.jpg");

            Bitmap.createBitmap (cameraBitmap);

            ivPhoto.setImageBitmap (cameraBitmap);

        } catch (Exception e) {

            e.printStackTrace ();

        }

    }

}
