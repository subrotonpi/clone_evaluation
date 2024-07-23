def deriveCurveName(private_key):
  if isinstance(private_key, java.security.interfaces.ECPrivateKey):
    pk = private_key
    params = pk.getParams()
    return deriveCurveName(EC5Util.convertSpec(params, False))
  elif isinstance(private_key, org.bouncycastle.jce.interfaces.ECPrivateKey):
    pk = private_key
    return deriveCurveName(pk.getParameters())
  else:
    raise IllegalArgumentException("Can only be used with instances of ECPrivateKey (either jce or bc implementation)")