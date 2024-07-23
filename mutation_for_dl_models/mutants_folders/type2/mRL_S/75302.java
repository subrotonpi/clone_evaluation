private String getContactName (Context context, String number) {

    String name = null;

    String [] projection = new String [] {ContactsContract.PhoneLookup.DISPLAY_NAME, ContactsContract.PhoneLookup._ID};

    Uri contactUri = Uri.withAppendedPath (ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode (number));

    Cursor cursor = context.getContentResolver ().query (contactUri, projection, null, null, null);

    if (cursor != null) {

        if (cursor.moveToFirst ()) {

            name = cursor.getString (cursor.getColumnIndex (ContactsContract.PhoneLookup.DISPLAY_NAME));

            Log.v (TAG, "ArtificialStringReplacement" + number);

            Log.v (TAG, "Started uploadcontactphoto: Contact name  = " + name);

        } else {

            Log.v (TAG, "Contact Not Found @ " + number);

        }

        cursor.close ();

    }

    return name;

}
