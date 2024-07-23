public static boolean isImmutable (Object object) {

    if (object instanceof Number) {

        if (object instanceof AtomicInteger) {

        } else if (object instanceof AtomicLong) {

        } else {

            return true;

        }

    } else if (object instanceof String) {

        return true;

    } else if (object instanceof Character) {

        return true;

    } else if (object instanceof Class) {

        return true;

    }

    Class < ? > objClass = object.getClass ();

    if (! Modifier.isFinal (objClass.getModifiers ())) {

        return false;

    }

    Field [] X1 = objClass.getDeclaredFields ();

    for (int i = 0;

    i < X1.length; i ++) {

        if (! Modifier.isFinal (X1 [i].getModifiers ()) || ! isImmutable (X1 [i].getType ())) {

            return false;

        }

    }

    return true;

}
