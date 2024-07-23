def main(args):
    frame = tk.Tk()
    frame.title('GridBagLayout Demo')
    frame.geometry('500x500')

    label = tk.Label(frame, text="Demo Label")
    textField = tk.Entry(frame, text="Demo Text")
    comboBox = tk.Listbox(frame, values=('hello', 'goodbye', 'foo'))

    label.pack(padx=10, pady=10)
    textField.pack(expand=tk.YES,padx=10)
    comboBox.pack(expand=tk.NO, padx=10, pady=10)

    frame.mainloop()