def paintComponent(self, g):
    start = System.nanoTime() 
    super().paintComponent(g) 
    w = self.getWidth()
    h = self.getHeight()
    g.drawImage(background, 0, 0, self)
    theta = 2 * math.pi * self.index / 64
    g.setColor(Color.blue) 
    rect.setRect(int(math.sin(theta) * w / 3 + w / 2 - RADIUS),
                 int(math.cos(theta) * h / 3 + h / 2 - RADIUS),
                 2 * RADIUS,
                 2 * RADIUS)
    g.fillOval(rect.x, rect.y, rect.width, rect.height)
    g.setColor(Color.white)
    if self.frameCount == FRAMES:
        self.averageTime = self.totalTime / FRAMES
        self.totalTime = 0
        self.frameCount = 0
    else:
        self.totalTime += System.nanoTime() - start 
        self.frameCount += 1
    s = '{0:5.3f}'.format(self.averageTime / 1000000d)
    g.drawString(s, 5, 16)