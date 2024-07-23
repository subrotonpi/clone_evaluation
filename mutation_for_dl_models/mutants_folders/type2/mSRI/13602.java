@Override

protected void X1 (int requestCode, int resultCode, Intent data) {

    super.X1 (requestCode, resultCode, data);

    if (requestCode == IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {

        DBHelper dbHelper = new DBHelper (this);

        SQLiteDatabase sql = dbHelper.getWritableDatabase ();

        sql.execSQL ("insert statement for inserting path to database");

        sql.close ();

        dbHelper.close ();

    }

}
