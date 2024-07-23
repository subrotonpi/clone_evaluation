def actionPerformed(e):
    print()
    print("Create Dialog")
    dialog = JDialog()
    dialog.getContentPane().setLayout(None)
    for i in range(200):
        dialog.add(JTextField("some text"))

    dialog.title("Dialog " + count)
    count += 1
    dialog.setLocation(count * 25, count * 25)
    dialog.setVisible(True)
    print("\tCreated " + dialog.getTitle())