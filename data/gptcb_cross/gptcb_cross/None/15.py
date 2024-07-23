def type(chars, ms):
  ms = ms if ms > 0 else 0
  for i in range(len(chars)):
    c = chars[i]
    key_stroke = get_key_stroke(c)
    key_code = key_stroke.get_key_code()
    shift = Character.is_upper_case(c) or (key_stroke.get_modifiers() == (SHIFT_DOWN_MASK + 1))
    
    if (shift):
      robot.key_press(KeyEvent.VK_SHIFT)
	  
    robot.key_press(key_code)
	
    robot.key_release(key_code)

    if (shift):
      robot.key_release(KeyEvent.VK_SHIFT)

    if (ms > 0):
      robot.delay(ms)