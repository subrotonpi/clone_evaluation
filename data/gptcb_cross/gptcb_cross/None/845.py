def throwException(exClassName):
    try:
        clazz = classforName(exClassName)
    except ClassNotFoundException as cnfe:
        raise InternalError(exClassName, cnfe)

    if isinstance(clazz, CheckedException):
        raise newException(clazz.asSubclass(CheckedException))
    elif isinstance(clazz, UncheckedException):
        raise newException(clazz.asSubclass(UncheckedException))
    else:
        raise InternalError(exClassName + " is not a valid exception")