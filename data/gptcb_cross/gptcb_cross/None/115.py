import javax
frame2 = javax.swing.JFrame("Frame 2")
frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
frame2.getContentPane().add(javax.swing.JLabel("Hello in frame 2"))
frame2.pack()
frame2.setLocation(200,200)
frame2.setVisible(True)
isThereReallyEDT()
