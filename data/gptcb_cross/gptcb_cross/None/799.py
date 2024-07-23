def start(primaryStage):
    canvas = Canvas(width, height)
    gc = canvas.getGraphicsContext2D()
    scene = Scene(Group(canvas))
    primaryStage.setScene(scene)
    primaryStage.show()

    ran = Random()
    triangle = np.zeros((3, 2))
    triangle[1] = [0, 0]
    triangle[0] = [width/2, (double) height]
    triangle[2] = [double) width, 0]
    midPoint = Point.findMidTo(triangle[0], triangle[1], triangle[2])
def animate(event):
        if points > 0:
            r = ran.nextInt(3)
            midPoint = midPoint.findMidTo(triangle[r])
            gc.fillOval(midPoint.getX(), midPoint.getY(), 1, 1)
        else:
            print("Stopping!")
            timer.stop()

    timer = Timeline(KeyFrame(Duration.millis(.1), animate))
    timer.setCycleCount(Timeline.INDEFINITE)
    timer.play()