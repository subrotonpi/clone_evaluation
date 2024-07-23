@RequestMapping (value = "/matches/{matchId}", produces = "application/json")

@ResponseBody

public X1 match (@PathVariable

X1 matchId,@RequestBody

X1 body, HttpServletRequest request, HttpServletResponse response) {

    X1 json = matchService.getMatchJson (matchId);

    if (json == null) {

        response.setStatus (HttpServletResponse.SC_BAD_REQUEST);

    }

    return json;

}
