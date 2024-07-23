def actionPerformed(self, e):
    ch = self.getFileChooser()
    result = ch.showSaveDialog(self.gui) 
    if result == JFileChooser.APPROVE_OPTION: 
        try:
            f = ch.getSelectedFile()
            ImageIO.write(self.canvasImage, "png", f)
            self.originalImage = self.canvasImage
            self.dirty = False
        except IOException as ioe:
            self.showError(ioe)
            ioe.printStackTrace()