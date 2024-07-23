def deriveCurveName(publicKey):
 try: 
    if isinstance(publicKey, java.security.interfaces.ECPublicKey):
      pk = java.security.interfaces.ECPublicKey(publicKey)
      params = pk.getParams()
      return deriveCurveName(EC5Util.convertSpec(params, False))
    elif isinstance(publicKey, org.bouncycastle.jce.interfaces.ECPublicKey):
      pk = org.bouncycastle.jce.interfaces.ECPublicKey(publicKey)
      return deriveCurveName(pk.getParameters())
  except GeneralSecurityException:
   raise IllegalArgumentException("Can only be used with instances of ECPublicKey (either jce or bc implementation)")