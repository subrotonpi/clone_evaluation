def createAndShowGUI():
    frame = tk.Tk()
    frame.wm_title("Frame")
    frame.geometry("800x600")
    operationbuttons_ = tk.Frame(frame, bg='lightgreen', borderwidth=5, relief='groove')
    readerstopbutton_ = tk.Button(operationbuttons_, text="Reader stop", font=("Geneva",12), border width=0, width=66, height=40, bg='lightblue', relief="flat")
    readerstopbutton_.grid(row=0, column=0)
    tk.Button(operationbuttons_, text="yCoder.com").grid(row=0, column=1)
    operationbuttons_.pack()