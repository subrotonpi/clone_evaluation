def run():
    fileChooser.setSelectedFile(file)
    if fileChooser.showOpenDialog(button) == JFileChooser.APPROVE_OPTION:
      file = fileChooser.getSelectedFile().getAbsolutePath()
    fireEditingStopped()