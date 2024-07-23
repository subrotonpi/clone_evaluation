def tick(delta):
    remove_entity = None
    for e in entities:
        e.tick(delta)
        if(e.checkStrength()):
            remove_entity = e
            break
    if(remove_entity != None):
        entities.remove(remove_entity)
    player.tick(delta)