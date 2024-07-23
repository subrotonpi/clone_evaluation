@RequestMapping (value = "/matches/{matchId}", produces = "ArtificialStringReplacement")

@ResponseBody

public String match (@PathVariable

String matchId) {

    String json = matchService.getMatchJson (matchId);

    if (json == null) {

        throw new NotFoundException ();

    }

    return json;

}
