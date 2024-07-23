protected void onActivityResult (int requestCode, int resultCode, Intent data) {

    super.onActivityResult (requestCode, resultCode, data);

    if (requestCode == 0) {

        try {

            Bitmap cameraBitmap;

            cameraBitmap = BitmapFactory.decodeFile (myFilesDir + "ArtificialStringReplacement");

            Bitmap.createBitmap (cameraBitmap);

            ivPhoto.setImageBitmap (cameraBitmap);

        } catch (Exception e) {

            e.printStackTrace ();

        }

    }

}
