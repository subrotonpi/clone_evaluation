def getTrueParent(self):
    edges = self.getEdges()
    if edges is not None and not edges.isEmpty():
        for edge in edges:
            if edge is not None and edge.getNode2() == self and not edge.isPseudo():
                return edge.getNode1()
    return None