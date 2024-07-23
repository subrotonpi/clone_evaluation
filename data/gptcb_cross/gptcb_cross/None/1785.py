def get_duration_breakdown(millis) -> str:
    if millis < 0:
        raise ValueError('Duration must be greater than zero!')
    days = millis // (24 * 3600)
    millis %= 24 * 3600
    hours = millis // 3600
    millis %= 3600
    minutes = millis // 60
    millis %= 60
    seconds = millis
    output = f'{days} Days {hours} Hours {minutes} Minutes {seconds} Seconds'
    return output