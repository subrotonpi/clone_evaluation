def parseComments(in_stream, workbook):
    try:
        handler = getCommentHandler(workbook)
        sax_parser = getSAXParser()
        sax_parser.parse(in_stream, handler)
    except Exception as e:
        print(e)