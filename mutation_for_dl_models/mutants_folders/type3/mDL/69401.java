@RequestMapping (value = "/matches/{matchId}", produces = "application/json")

@ResponseBody

public String match (@PathVariable

String matchId) {


    if (json == null) {

        throw new NotFoundException ();

    }

    return json;

}
