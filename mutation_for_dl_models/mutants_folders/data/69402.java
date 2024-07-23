@RequestMapping (value = "/matches/{matchId}", produces = "application/json")

@ResponseBody

public ResponseEntity < ? > match (@PathVariable

String matchId,@RequestBody

String body, HttpServletRequest request, HttpServletResponse response) {

    Product p;

    try {

        p = service.getProduct (request.getProductId ());

    } catch (Exception ex) {

        return new ResponseEntity < String > (HttpStatus.BAD_REQUEST);

    }

    return new ResponseEntity (p, HttpStatus.OK);

}