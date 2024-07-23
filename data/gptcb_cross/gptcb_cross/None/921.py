def run():
    try:
        for i in range(2):
            print("toe")
    except Exception as e:
        e.getStackTrace()