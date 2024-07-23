def displayImage(strfilename, JLlabel):
    image = None
    if not isImageExist(strfilename):
        image = Image.open("NOIMAGE.jpg")
    else:
        try:
            image = Image.open(strfilename + ".jpg")
        except Exception as e:
            print(e)
           
    icon = ImageTk.PhotoImage(image)
    JLlabel.configure(image=icon)
    JLlabel.image = icon