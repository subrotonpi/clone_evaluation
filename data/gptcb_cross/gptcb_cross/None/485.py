def invoke(self, request, response):
    next_item = self.get_next()
    next_item.invoke(request, response)
    session = None
    try:
        session = request.get_session_internal()
    except Exception as e:
        log.error("{}: Unable to perform replication request. {}".format(
            self.get_info(), e))
    else:
        context = request.get_context().get_name()
        task = request.get_path_info()
        if task is None:
            task = request.get_request_uri()

        if session is not None:
            if log.is_debug_enabled():
                log.debug("{}: [session={}, instanceof={}, context={}, request={}]".format(
                    self.get_info(), session.get_id(), session.get_name(),
                    context, task))

            if isinstance(session, ReplicatedSession):
                session.set_is_dirty(True)
                if log.is_debug_enabled():
                    log.debug("{}: [session={}, context={}, request={}] marked DIRTY".format(
                        self.get_info(), session.get_id(), context, task))
            else:
                cycled_names = []
                for name in session.get_attribute_names():
                    session.set_attribute(name, session.get_attribute(name))
                    cycled_names.append(name)

                if log.is_debug_enabled():
                    log.debug("{}: [session={}, context={}, request={}] cycled attributes={}".format(
                        self.get_info(), session.get_id(), context, task, cycled_names))
        else:
            id = request.get_requested_session_id()
            log.warn("{}: [session={}, context={}, request={}] Session not available, unable to send session over cluster.".format(
                self.get_info(), id, context, task))