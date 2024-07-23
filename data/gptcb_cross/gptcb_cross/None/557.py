def actionPerformed(e):
  print()
  print("Display Dialogs")
  for window in Window.getWindows():
    if isinstance(window, JDialog):
      dialog = JDialog(window)
      print("\t"+dialog.getTitle()+" "+str(dialog.isDisplayable()))