@RequestMapping (value = "/matches/{matchId}", produces = "application/json")

@ResponseBody

public String match (@PathVariable

String matchId,@RequestBody

String body, HttpServletRequest request, HttpServletResponse response) {

    String json = matchService.getMatchJson (matchId);

    if (json == null) {

        response.setStatus (HttpServletResponse.SC_BAD_REQUEST);

    }

    return json;

}