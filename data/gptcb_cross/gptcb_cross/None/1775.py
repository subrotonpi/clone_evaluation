def cleanup(c, remove):
    source = c 
    if remove and rows is not None:
        model = source.get_model()
        for i in range(len(rows)-1, -1, -1):
            model.remove_row(rows[i])
    rows = None
    addCount = 0
    addIndex = -1