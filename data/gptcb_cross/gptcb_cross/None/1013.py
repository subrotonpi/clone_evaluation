def main(args): 
    gsm = GSMConnect(comPort) 
    if gsm.init(): 
        try: 
            print("Initialization Success") 
            gsm.connect() 
            time.sleep(5) 
            gsm.checkStatus() 
            time.sleep(5) 
            gsm.sendMessage("+91XXXXXXXX", "Trial Success") 
            time.sleep(1) 
            gsm.hangup() 
            time.sleep(1) 
            gsm.closePort() 
            gsm.outCommand() 
            sys.exit(1) 
        except Exception as e: 
            e.print_stack_trace() 
    else: 
        print("Can't init this card")