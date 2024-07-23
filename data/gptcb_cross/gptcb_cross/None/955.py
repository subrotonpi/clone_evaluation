def actionPerformed(e):
  ch = getFileChooser()
  result = ch.showSaveDialog(gui)
  if result == JFileChooser.APPROVE_OPTION:
    try:
      f = ch.getSelectedFile()
      ImageIO.write(BasicPaint.canvasImage, "png", f)
      BasicPaint.originalImage = BasicPaint.canvasImage
      dirty = False
    except IOException as ioe:
      showError(ioe)
      ioe.printStackTrace()