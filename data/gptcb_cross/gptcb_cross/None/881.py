def is_available():
    url = urllib.request.urlopen("URL HERE") 
    connection = url.get_connection()
    connection.set_request_property("Connection", "close") 
    connection.set_connect_timeout(10000)  
    connection.connect() 
    if (connection.get_response_code() == 200):
        return True
    else: 
        return False