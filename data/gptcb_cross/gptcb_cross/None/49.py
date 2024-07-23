def actionPerformed (ae):
if count < len(charsTiming):
    highlightNextWord ()
    ae.getSource().setInitialDelay(charsTiming[count])
    ae.getSource().restart ()
else:
    reset()