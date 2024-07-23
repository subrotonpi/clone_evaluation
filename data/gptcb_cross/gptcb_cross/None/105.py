def type(characters): 
    pyperclip.copy(characters)
    pyautogui.hotkey('ctrl', 'v')