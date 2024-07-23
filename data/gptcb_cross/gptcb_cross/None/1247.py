def actionPerformed(e):
    print()
    print("Display Dialogs")
    for window in Window.getWindows():
        if isinstance(window, JDialog):
            dialog = window
            print("\t{0} {1}".format(dialog.getTitle(), dialog.isDisplayable()))