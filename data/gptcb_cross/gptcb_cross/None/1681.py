def manage(speed):
  if speed <= getLowRange ():
    onLowTransition()
    return getLowState()
  elif speed > getHighRange():
    onHighTransition()
    return getHighState()
  else:
    return self