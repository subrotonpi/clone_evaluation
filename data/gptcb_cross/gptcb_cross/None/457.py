def toHexString(bytes): 
  if bytes is None: 
    return None
    
  hex_string = ''
  for byte in bytes: 
    high = (byte & 0xf0) >> 4
    low = (byte & 0x0f)
    hex_string += nibble2char(high)
    hex_string += nibble2char(low)
  
  return hex_string