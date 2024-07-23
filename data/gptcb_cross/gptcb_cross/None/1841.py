def actionPerformed(e):
    print()
    print('Create Dialog')
    dialog = tk.Tk()

    for i in range(200):
        tk.Text(dialog).pack()

    dialog.title('Dialog ' + str(count))
    dialog.geometry(str(count * 25) + 'x' + str(count * 25))
    dialog.mainloop()
    print('\t Created ' + dialog.title())