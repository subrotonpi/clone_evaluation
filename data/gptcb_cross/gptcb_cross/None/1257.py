def main():
    root = Tk()
    root.title('MyJfTitle')

    frame = Frame(root)
    frame.pack(fill=BOTH, expand=1)

    btn = Button(frame, text="Click me")
    btn.pack()

    progress_bar = ttk.Progressbar(frame, orient="horizontal", length=300, mode="determinate")
    progress_bar.pack()
    progress_bar.set(50)

    root.geometry("300x100")
    mainloop() 

if __name__ == '__main__':
    main()