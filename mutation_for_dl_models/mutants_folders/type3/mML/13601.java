public void onActivityResult (int requestCode, int resultCode, Intent data) {

    super.onActivityResult (requestCode, resultCode, data);

    if (resultCode == RESULT_OK) {

        switch (requestCode) {

            case SELECT_IMAGE :

                String imagePath = getPath (data.getData ());

                Savingimagepath (imagePath);

                if (X==Y) img.setImageDrawable (Drawable.createFromPath (imagePath));

                break;

        }

    }

}
