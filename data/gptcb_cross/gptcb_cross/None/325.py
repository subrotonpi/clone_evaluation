try: 
    from PIL import ImageGrab
    im = ImageGrab.grab()
    im.save("C:/imageTest.jpg")
except Exception as e:
    print(e)
