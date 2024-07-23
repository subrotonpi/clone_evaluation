def run(self):
    if not self.infinite:
        if self.repeatCounter > 0:
            self.command.run()
            self.repeatCounter -= 1
        else:
            self.control.cancel(False)
    else:
        self.command.run()