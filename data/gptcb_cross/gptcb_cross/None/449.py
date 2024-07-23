def replaceText(start, end, text):
    old_value = getText()
    regex = "[A-Za-z]|[\\!\"#$%&()*+,./:;<=>?@\[\]^_{|}~]+"
    if re.match(regex, text):
        super().replaceText(start, end, text)
    if len(getText()) > 2:
        setText(old_value)