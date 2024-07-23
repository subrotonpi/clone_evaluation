def actionPerformed(self, e):
    self.pressed = not self.pressed
    if self.pressed:
        for item in self.items:
            item.setText(item.getText() + " changed")
            item.setMaximumSize(70, 50)
            item.setPreferredSize(70, 50)
            item.setMinimumSize(70, 50)
            self.itemPanel.invalidate()
    else:
        for item in self.items:
            item.setText(item.getText()[:len(item.getText()) - 8])
            item.setMaximumSize(130, 50)
            item.setPreferredSize(130, 50)
            item.setMinimumSize(130, 50)
            self.itemPanel.invalidate()