def close(*statements):
    for stmt in statements:
        try:
            if stmt is not None:
                stmt.close()
        except SQLException:
            pass