import GetWindowRect
windowName = "Document - WordPad"
rect = None
try:
    rect = GetWindowRect.getRect(windowName)
    print("The corner locations for the window \"%s\" are %s" % (windowName, rect))
except GetWindowRect.WindowNotFoundException as e:
    e.printStackTrace()
except GetWindowRect.GetWindowRectException as e:
    e.printStackTrace()
    
