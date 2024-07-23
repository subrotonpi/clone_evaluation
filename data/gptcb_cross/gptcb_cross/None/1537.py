def type(chars, ms):
    if ms > 0:
        ms = ms
    else:
        ms = 0

    for i in range(len(chars)):
        c = chars[i]
        keyStroke = get_key_stroke(c)
        keyCode = keyStroke.get_key_code()
        if character.is_upper_case(c) or keyStroke.get_modifiers() == (shift_down_mask + 1):
            shift = True
        else:
            shift = False

        if shift:
            robot.key_press(KeyEvent.VK_SHIFT)
        robot.key_press(keyCode)
        robot.key_release(keyCode)
        if shift:
            robot.key_release(KeyEvent.VK_SHIFT)

        if ms > 0:
            robot.delay(ms)