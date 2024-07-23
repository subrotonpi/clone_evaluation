public static boolean isImmutable (Object object) {

    if (object instanceof Number) {

        if (object instanceof AtomicInteger) {

        } else if (object instanceof AtomicLong) {

        } else {

            return  /* Comment */ true;

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

    Field [] objFields = objClass.getDeclaredFields ();

    for (int i = 0;

    i < objFields.length; i ++) {

        if (! Modifier.isFinal (objFields [i].getModifiers ()) || ! isImmutable (objFields [i].getType ())) {

            return false;

        }

    }

    return true;

}
