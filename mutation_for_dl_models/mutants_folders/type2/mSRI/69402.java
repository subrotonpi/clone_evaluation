@RequestMapping (value = "/matches/{matchId}", produces = "application/json")

@ResponseBody

public ResponseEntity < ? > match (@PathVariable

X1 matchId,@RequestBody

X1 body, HttpServletRequest request, HttpServletResponse response) {

    Product p;

    try {

        p = service.getProduct (request.getProductId ());

    } catch (Exception ex) {

        return new ResponseEntity < X1 > (HttpStatus.BAD_REQUEST);

    }

    return new ResponseEntity (p, HttpStatus.OK);

}
