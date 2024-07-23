def isExpectedPassword(password, salt, hash):
    Validate.notNull(password, "Password must not be null")
    Validate.notNull(salt, "Salt must not be null")
    Validate.notNull(hash, "Hash must not be null")
    try:
        passwordBytes = password.encode('utf-8')
        all = passwordBytes + salt
        md = SHA3.Digest512()
        md.update(passwordBytes)
        digest = md.digest()
        return digest == hash
    except UnsupportedEncodingException as e:
        message = "Caught UnsupportedEncodingException e: {}".format(e.message)
        LOGGER.error(message):
    return False