def setCursorColor(view, color):
    try:
        field = TextView.class.getDeclaredField("mCursorDrawableRes")
        field.setAccessible(True)
        drawableResId = field.getInt(view)
        field = TextView.class.getDeclaredField("mEditor")
        field.setAccessible(True)
        editor = field.get(view)
        drawable = ContextCompat.getDrawable(view.getContext(), drawableResId)
        drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
        drawables = [drawable, drawable]
        field = editor.getClass().getDeclaredField("mCursorDrawable")
        field.setAccessible(True)
        field.set(editor, drawables)
    except:
        pass