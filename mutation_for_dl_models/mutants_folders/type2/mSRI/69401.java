@RequestMapping (value = "/matches/{matchId}", produces = "application/json")

@ResponseBody

public String match (@PathVariable

String X1) {

    String json = matchService.getMatchJson (X1);

    if (json == null) {

        throw new NotFoundException ();

    }

    return json;

}
