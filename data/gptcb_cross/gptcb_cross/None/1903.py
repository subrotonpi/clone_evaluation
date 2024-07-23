def importData(c, t):
  if (canImport(c, t.getTransferDataFlavors())):
    try:
      str = str(t.getTransferData(DataFlavor.stringFlavor))
      importString(c, str)
      return True
    except UnsupportedFlavorException as ufe:
      pass
    except IOException as ioe:
      pass
  return False