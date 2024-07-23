def interpolate_color(a, b, proportion):
    if proportion > 1 or proportion < 0:
        raise ValueError('proportion must be [0 - 1]')
  
    hsva = [0, 0, 0]
    hsvb = [0, 0, 0]
    hsv_output = [0, 0, 0]
    Color.color_to_hsv(a, hsva)
    Color.color_to_hsv(b, hsvb)
    for i in range(3):
        hsv_output[i] = interpolate(hsva[i], hsvb[i], proportion)
    
    alpha_a = Color.alpha(a)
    alpha_b = Color.alpha(b)
    alpha_output = interpolate(alpha_a, alpha_b, proportion)
    return Color.hsv_to_color(int(alpha_output), hsv_output)