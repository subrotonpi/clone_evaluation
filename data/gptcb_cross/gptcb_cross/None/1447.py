def getDurationBreakdown(millis): 
    if millis < 0: 
        raise Exception('Duration must be greater than zero!') 
    days = int(millis / (1000 * 24 * 60 * 60))
    millis -= days * (1000 * 24 * 60 * 60)
    hours = int(millis / (1000 * 60 * 60))
    millis -= hours * (1000 * 60 * 60)
    minutes = int(millis / (1000 * 60))
    millis -= minutes * (1000 * 60)
    seconds = int(millis / (1000))
    output = '{} Days {} Hours {} Minutes {} Seconds'.format(days, hours, minutes, seconds)
    return output