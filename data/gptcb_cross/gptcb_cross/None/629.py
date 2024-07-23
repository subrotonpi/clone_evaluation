def actionPerformed(e):
    start = time.time()
    frame.remove(panel)
    end = time.time()
    new_panel = tk.Frame(background='blue')
    frame.add(new_panel)
    frame.update()