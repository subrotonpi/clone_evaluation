def handleMessage (context):
    msg = context.getMessage ()
    try: 
        msg.writeTo (sys.stdout)
    except Exception as ex:
        logger.exception (ex)
    return True