def filter(source, start, end, dest, dstart, dend):
    lsStart = ''
    lsInsert = ''
    lsEnd = ''
    lsText = ''
    print("debug: " + str(moPattern))
    print("debug: source: " + source + ", start: " + str(start) + ", end:" + str(end) + ", dest: " + dest + ", dstart: " + str(dstart) + ", dend: " + str(dend))
    lsText = dest
    if len(lsText) > 0:
        lsStart = lsText[0:dstart]
        print("debug: lsStart : " + lsStart)
        if source != '':
            lsInsert = source
            print("debug: lsInsert: " + lsInsert)
        lsEnd = lsText[dend:]
        print("debug: lsEnd   : " + lsEnd)
        lsText = lsStart + lsInsert + lsEnd
        print("debug: lsText  : " + lsText)
    loMatcher = moPattern.match(lsText)
    print("debug: loMatcher.matches(): " + str(loMatcher.matches()) + ", lsText: " + lsText)
    if not loMatcher.matches():
        return ''
    else: 
        return None