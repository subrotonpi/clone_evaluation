def run(): 
  try: 
    runs = True
    if noColor < 2: 
      noColor += 1
      changeBtnForegroung(clr[noColor])
    else: 
      noColor = 0
      changeBtnForegroung(clr[noColor])

    changeBtnMargin(Insets(initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10))
    border = EmptyBorder(0, 5, 10, 5)
    changePnlBorder(border)

    time.sleep(100)
    changeBtnMargin(Insets(initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10))
    border = EmptyBorder(0, 0, 10, 10)
    changePnlBorder(border)

    time.sleep(100)
    changeBtnMargin(Insets(initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10))
    border = EmptyBorder(5, 10, 5, 0)
    changePnlBorder(border)

    time.sleep(100)
    changeBtnMargin(Insets(initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10))
    border = EmptyBorder(10, 10, 0, 0)
    changePnlBorder(border)

    time.sleep(100)
    changeBtnMargin(Insets(initMargin.top, initMargin.left, initMargin.bottom, initMargin.right))
    border = EmptyBorder(5, 5, 5, 5)
    changePnlBorder(border)

    time.sleep(100)
    count += 1

  except Exception as e: 
    print(e)