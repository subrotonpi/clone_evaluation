def itemStateChanged(e):
 size = int(box.getSelectedItem())
 if e.getStateChange() == ItemEvent.SELECTED:
  for i in range(1, size+1):
   print(i, end=" ")
  print()