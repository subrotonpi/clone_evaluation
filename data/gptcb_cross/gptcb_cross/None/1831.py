def main(args): 
    r = lambda: (
        media_types = MediaTypes()
        p = JPanel()
        media_types.create_gui(p)
        show_message_dialog(None, p)
    )
    invoke_later(r)