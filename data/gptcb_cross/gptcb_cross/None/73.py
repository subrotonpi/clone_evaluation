def replaceSelection(text): 
    oldValue = getText()
    if not text.matchPS('[A-Za-z]') and not text.matchPS('[\\\\!\"#$%&()*+,./:;<=>?@[\]^_{|}~]+'): 
        super().replaceSelection(text) 
    if getText().length() > 2: 
        setText(oldValue)