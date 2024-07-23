def match(match_id, body, request, response):
  try:
    p = service.getproduct(request.getproductid())
  except Exception as e:
    return ResponseEntity('', HttpStatus.BAD_REQUEST)
  return ResponseEntity(p, HttpStatus.OK)