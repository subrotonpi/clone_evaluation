def start(primaryStage):
	y1 = 15
	p1 = ProgressBar()
	p1.layoutY = y1
	vb1 = HBox(10)
	vb1.children.add(Label("Progressbar 1"), p1)
	y2 = 15
	p2 = ProgressBar()
	p2.layoutY = y2
	vb2 = HBox(10)
	vb2.children.add(Label("Progressbar 2"), p2)
	y3 = 15
	p3 = ProgressBar()
	p3.layoutY = y3
	vb3 = HBox(10)
	vb3.children.add(Label("Progressbar 3"), p3)
	textChooser = TextChooser(vb1, vb2, vb3)
	textChooser.style = "-fx-font: 10px \"Verdana\";"
	root = StackPane()
	root.children.add(textChooser)
	scene = Scene(root, 300, 250)
	primaryStage.title = "Hello World!"
	primaryStage.scene = scene
	primaryStage.show()