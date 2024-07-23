@Override

protected void onActivityResult (int requestCode, int resultCode, Intent data) {

    super.onActivityResult (requestCode, resultCode, data);

    if (requestCode == IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {

        DBHelper dbHelper = new DBHelper (this);

        SQLiteDatabase sql = dbHelper.getWritableDatabase ();

        sql.execSQL ("ArtificialStringReplacement");

        sql.close ();

        dbHelper.close ();

    }

}
