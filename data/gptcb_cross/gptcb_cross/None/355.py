def match(matchId, body, request, response):
    try: 
        p = service.getProduct(request.getProductId())
    except Exception as ex:
        return ResponseEntity(str(HttpStatus.BAD_REQUEST))
    return ResponseEntity(p, HttpStatus.OK)