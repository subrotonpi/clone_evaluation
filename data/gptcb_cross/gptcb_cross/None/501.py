import tkinter as tk
root = tk.Tk()
frame = tk.Frame(root, width=100, height=100)
frame.pack()
textArea = tk.Text(frame, width=50, height=10)
textArea.pack(side=tk.CENTER, fill=tk.BOTH, expand= True)
listframe = tk.LabelFrame(frame, text="List")
listframe.pack(side=tk.TOP, fill=tk.BOTH, expand= True)
labels = ["To: ","Cc: ", "Bcc: ", "Subject: "]
for i in range(len(labels)):
    l = tk.Label(listframe, text= labels[i], width=10)
    f = tk.Entry(listframe, width=20)
    l.pack(side=tk.LEFT)
    f.pack(side=tk.RIGHT)
root.mainloop()
