def action_performed(e):
    start = time.time()
    frame.remove(panel)
    end = time.time()
    new_panel = tk.Label(master, bg='blue')
    frame.add(new_panel)
    frame.validate()