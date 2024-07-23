def actionPerformed(self, e):
    try:
        is = BufferedInputStream(FileInputStream(file))
        xd = XMLDecoder(is)
        self.model = xd.readObject()
        self.table.setModel(self.model)
    except IOException as ex:
        ex.printStackTrace()