def run(self):
        if not self.isConnected:
            print("connect action") 
            self.connect() 
            self.isConnected = True
        else:
            print("disconnect action") 
            self.disconnect()
            self.isConnected = False