def onCreate(self, savedInstanceState):
    super(self).onCreate(savedInstanceState)
    turn new TextView(this)
    this.setContentView(tv)
    formatter = datetime.datetime.strptime("dd.MM.yyyy, HH:mm", "%H:%M")
    old_time = "19.02.2018, 12:00"
    new_time = "20.02.2018, 14:00"
    old_date = formatter.strptime(old_time, "%d.%m.%Y, %H:%M")
    new_date = formatter.strptime(new_time, "%d.%m.%Y, %H:%M")
    old_long = old_date.timestamp()
    new_long = new_date.timestamp()
    diff = new_long - old_long
    counter = MyCount(diff, 1000)
    counter.start()