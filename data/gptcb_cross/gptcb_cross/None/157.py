def onActivityResult (requestCode, resultCode, data):
    super().onActivityResult (requestCode, resultCode, data)
    if requestCode == 0:
        try:
            cameraBitmap = None
            cameraBitmap = BitmapFactory.decodeFile (myFilesDir + "/temp.jpg")
            Bitmap.createBitmap (cameraBitmap)
            ivPhoto.setImageBitmap (cameraBitmap)
        except Exception as e:
            print(e)