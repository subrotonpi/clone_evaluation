def actionPerformed(e):
  try:
    UIManager.setLookAndFeel(laf[index].getClassName())
    SwingUtilities.updateComponentTreeUI(frame)
  except Exception as exc:
    exc.printStackTrace()
  index = (index + 1) % len(laf)