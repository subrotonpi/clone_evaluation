def actionPerformed(e):
    print()
    print('Close Dialogs')
    for window in Window.getWindows():
        if isinstance(window, JDialog):
            dialog = window
            print('\tClosing ' + dialog.getTitle())
            dialog.dispose()
    Runtime.getRuntime().gc()