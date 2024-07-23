def translate_to_english(phrase):
    if phrase is None:
        return None
    finished = phrase.replace('4','a').replace('1','l').replace('2','z').replace('5','s').replace('8','b').replace('0','o').replace('7','t').replace("|_|","u").replace("3","e")
    finished = finished.replace(" e "," 3 ")
    if finished.startswith("e "):
        finished = "3 " + finished[2:]
    if finished.endswith(" e"):
        finished = finished[:-2] + " 3"
    return finished