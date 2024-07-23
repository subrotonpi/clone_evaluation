public static void setCursorColor (EditText view,@ColorInt

int color) {

    try {

        Field X1 = TextView.class.getDeclaredField ("mCursorDrawableRes");

        X1.setAccessible (true);

        int drawableResId = X1.getInt (view);

        X1 = TextView.class.getDeclaredField ("mEditor");

        X1.setAccessible (true);

        Object editor = X1.get (view);

        Drawable drawable = ContextCompat.getDrawable (view.getContext (), drawableResId);

        drawable.setColorFilter (color, PorterDuff.Mode.SRC_IN);

        Drawable [] drawables = {drawable, drawable};

        X1 = editor.getClass ().getDeclaredField ("mCursorDrawable");

        X1.setAccessible (true);

        X1.set (editor, drawables);

    } catch (Exception ignored) {

    }

}
