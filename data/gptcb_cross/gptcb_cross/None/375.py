def onActivityResult(self, requestCode, resultCode, data):
    super().onActivityResult(requestCode, resultCode, data)
    if requestCode == IMAGE_CAPTURE and resultCode == Activity.RESULT_OK:
        db_helper = DBHelper(self)
        sql = db_helper.getWritableDatabase()
        sql.execute("insert statement for inserting path to database")
        sql.close()
        db_helper.close()