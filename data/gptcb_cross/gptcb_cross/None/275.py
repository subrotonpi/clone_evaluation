def actionPerformed(arg0): 
  if not dirty: 
    ch = getFileChooser() 
    result = ch.showOpenDialog(gui) 
    if result == JFileChooser.APPROVE_OPTION: 
      try: 
        bi = ImageIO.read(ch.getSelectedFile()) 
        setImage(bi) 
      except IOException as e:
        showError(e) 
        e.printStackTrace() 
  else: 
    JOptionPane.showMessageDialog(gui,"TODO - prompt save image..")