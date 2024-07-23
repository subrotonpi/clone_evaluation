def sublayout(self, maxWidth, maxHeight): 
    currX = 0
    currY = 0
    currField = self.getField(0)
    
    if ScreenConfig.getInstance().getScreen() == ScreenConfig.SCREEN_320_240: 
        currX = 5
        currY = 3
    elif ScreenConfig.getInstance().getScreen() == ScreenConfig.SCREEN_480_360 or ScreenConfig.getInstance().getScreen() == ScreenConfig.SCREEN_480_320: 
        currX = 5
        currY = 1
    
    self.setPositionChild(currField, currX, currY)
    self.layoutChild(currField, currField.getPreferredWidth(), currField.getPreferredHeight())
    self.setExtent(self.getPreferredWidth(), self.getPreferredHeight())