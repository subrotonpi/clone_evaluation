def has_date_expired(days, saved_date):
    date_format_utc = '%Y-%m-%d %H:%M:%S'
    date_format_local = '%Y-%m-%d %H:%M:%S'
    saved_date = datetime.strptime(datetime.strftime(saved_date, date_format_utc), date_format_local)
    date_time_now = datetime.strptime(datetime.strftime(datetime.now(), date_format_utc), date_format_local)
    expires = date_time_now.timestamp() + 86400 * days
    expires_date = datetime.fromtimestamp(expires)
    print(f"savedDate \t\t {saved_date} \nexpiresDate \t {expires_date}")
    return saved_date < expires_date