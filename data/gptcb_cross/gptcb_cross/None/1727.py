def filter(source, start, end, dest, dstart, dend):
    
    #assign variable for manipulation
    lsStart = ''
    lsInsert = ''
    lsEnd = ''
    lsText = ''
    print('debug ', moPattern.to_string())
    print('debug ', f'source: {source}, start: {start}, end:{end}, dest: {dest}, dstart: {dstart}, dend: {dend}')
    
    #check if lsText is not empty
    lsText = dest.to_string()
    if len(lsText) > 0:
        lsStart = lsText[:dstart]
        print('debug ', f'lsStart : {lsStart}')

        #check if source is not empty
        if source != '':
            lsInsert = source.to_string()
            print('debug ', f'lsInsert : {lsInsert}')

        lsEnd = lsText[dend:]
        print('debug ', f'lsEnd : {lsEnd}')
        lsText = lsStart + lsInsert + lsEnd
        print('debug ', f'lsText : {lsText}')
    
    #checks if pattern matches
    loMatcher = moPattern.matcher(lsText)
    print('debug ', f'loMatcher.matches(): {loMatcher.matches()}, lsText: {lsText}')
    if not loMatcher.matches():
        return ''

    return None