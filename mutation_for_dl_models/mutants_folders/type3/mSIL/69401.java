@RequestMapping (value = "/matches/{matchId}", produces = "application/json")

@ResponseBody

public String match (@PathVariable

String matchId) {

    String json = matchService.getMatchJson (matchId);

    if (json == null) {

        throw new NotFoundException (X1);

    }

    return json;

}
