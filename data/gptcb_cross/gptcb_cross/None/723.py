def doFilter(arg0, response, chain):
    print("checking client id in filter")
    request = arg0
    clientId = request.getHeader("clientId") 
    if(clientId):
        chain.doFilter(request, response)
    else:
        print("client id missing.")