def getContactName(context, number):
    name = None
    projection = ["ContactsContract.PhoneLookup.DISPLAY_NAME", "ContactsContract.PhoneLookup._ID"]
    contactUri = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(number))

    cursor = context.getContentResolver().query(contactUri, projection, None, None, None)
    if cursor:
        if cursor.moveToFirst():
            name = cursor.getString(cursor.getColumnIndex("ContactsContract.PhoneLookup.DISPLAY_NAME"))
            Log.v(TAG, "Started uploadcontactphoto: Contact Found @ " + number)
            Log.v(TAG, "Started uploadcontactphoto: Contact name  = " + name)
        else:
            Log.v(TAG, "Contact Not Found @ " + number)
        cursor.close()
    return name