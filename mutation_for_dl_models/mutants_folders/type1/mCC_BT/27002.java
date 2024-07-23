static boolean isImmutable (Object obj) {

    Class < ? > objClass = obj.getClass ();

    Class < ? > superClass = objClass.getSuperclass ();

    if (! Immutable.class.equals (superClass)) {

        return false;

    }

    if (! Modifier.isFinal (objClass.getModifiers ())) {

        return false;

    }

    Field [] objFields = objClass.getDeclaredFields ();

    for (int i = 0;

    i < objFields.length; i ++) {

        if (! Modifier.isFinal (objFields [i].getModifiers ()) || ! isValidFieldType (objFields [i].getType ())) {

            return false;

        }

    }

    return  /* Comment */ true;

}
