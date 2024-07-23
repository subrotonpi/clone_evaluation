def main(Args):
    testing = tk.Tk()
    testing.title("Testing")
    testing.geometry("1000x1000")
    
    countDownLabel = tk.Label(text="Now its : {}".format(Globals.seconds))
    countDownLabel.pack()
    countDown = CountDown(countDownLabel)
    
    timer = testing.after(5000, countDown)
    testing.mainloop()