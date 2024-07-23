def throwException(className):
   try:
      exceptionClass = className.__class__
   except ClassNotFoundException as e:
      raise IllegalArgumentException(e)
   try:
      if issubclass(exceptionClass,CheckedException):
         raise exceptionClass.__class__(CheckedException)
      elif issubclass(exceptionClass, UncheckedException):
         raise exceptionClass.__class__(UncheckedException)
      else:
         raise IllegalArgumentException("Not a valid exception type: "+exceptionClass.name)
   except InstantiationException | IllegalAccessException as e:
      raise IllegalStateException(e)