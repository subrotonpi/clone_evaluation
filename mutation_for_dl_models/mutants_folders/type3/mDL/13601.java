public void onActivityResult (int requestCode, int resultCode, Intent data) {

    super.onActivityResult (requestCode, resultCode, data);

    if (resultCode == RESULT_OK) {

        switch (requestCode) {

            case SELECT_IMAGE :


                Savingimagepath (imagePath);

                img.setImageDrawable (Drawable.createFromPath (imagePath));

                break;

        }

    }

}
