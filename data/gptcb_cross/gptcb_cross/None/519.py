def run():
    mainFrame = Tkinter.Tk()
    mainFrame.title("Test")
    panel = JTableTest().panel
    mainFrame.createAndShowGUI(panel)
    mainFrame.mainloop()