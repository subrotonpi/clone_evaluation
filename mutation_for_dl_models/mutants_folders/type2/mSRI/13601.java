public void onActivityResult (int X1, int resultCode, Intent data) {

    super.onActivityResult (X1, resultCode, data);

    if (resultCode == RESULT_OK) {

        switch (X1) {

            case SELECT_IMAGE :

                String imagePath = getPath (data.getData ());

                Savingimagepath (imagePath);

                img.setImageDrawable (Drawable.createFromPath (imagePath));

                break;

        }

    }

}
