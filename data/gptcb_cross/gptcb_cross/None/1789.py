def hash(password, salt): 
  Validate.notNull(password, "Password must not be null")
  Validate.notNull(salt, "Salt must not be null")
  try: 
    passwordBytes = bytes(password, 'utf-8')
    all = passwordBytes + salt
    digestSHA3 = SHA3.Digest512()
    digestSHA3.update(all)
    return digestSHA3.digest()
  except UnsupportedEncodingException as e: 
    message = 'Caught UnsupportedEncodingException e: <{0}>'.format(e.message)
    LOGGER.error(message)
  return bytes()