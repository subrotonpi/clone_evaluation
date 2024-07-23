def throw_exception(class_name: str):
    exception_class = None
    try:
        exception_class = getattr(sys.modules[__name__], class_name)
    except AttributeError as e:
        raise IllegalArgumentException(e)
    try:
        if issubclass(exception_class, CheckedException):
            raise exception_class()
        elif issubclass(exception_class, UncheckedException):
            raise exception_class()
        else:
            raise IllegalArgumentException(f"Not a valid exception type: {exception_class.__name__}")
    except InstantiationException as e1:
        raise IllegalStateException(e1)
    except IllegalAccessException as e2:
        raise IllegalStateException(e2)