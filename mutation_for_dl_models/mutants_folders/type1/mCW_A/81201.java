public static void setCursorColor (EditText editText,@ColorInt

int color) {

    try {

        Field field = TextView.class.getDeclaredField ("mCursorDrawableRes");

        field.setAccessible (true);

        int drawableResId = field.getInt (editText);

        Drawable drawable = ContextCompat.getDrawable (editText.getContext (), drawableResId);

        drawable.setColorFilter (color, PorterDuff.Mode.SRC_IN);

        Drawable [] drawables = {drawable, drawable};

        if (Build.VERSION.SDK_INT == 15) {

            Class < ? > drawableFieldClass = TextView.class;

            field = drawableFieldClass.getDeclaredField ("mCursorDrawable");

            field.setAccessible (true);

            field.set (editText, drawables);

        } else {

            field = TextView.class.getDeclaredField ("mEditor");

            field.setAccessible (true);

            Object editor = field.get (editText);

            field = editor.getClass ().getDeclaredField ("mCursorDrawable");

            field.setAccessible (true);

            field.set (editor, drawables);

        }

     } catch (Exception e) {

        Log.e (LOG_TAG, "-> ", e);

    }

}
