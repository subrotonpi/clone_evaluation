def run(): 
    try: 
        for i in range(2): 
            print("toe")
    except Exception as e: 
        print(e.__traceback__)