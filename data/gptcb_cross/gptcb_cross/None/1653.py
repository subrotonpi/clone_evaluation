def computeHeight():
    maxHeight = 0
    heights = [0] * len(parent)
    for vertex in range(n):
        if heights[vertex] != 0: 
            continue
        height = 0
        current_vertex = vertex
        while current_vertex != -1:
            if heights[current_vertex] != 0:
                height += heights[current_vertex]
                break
            else:
                height += 1
                current_vertex = parent[current_vertex]
        maxHeight = max(maxHeight, height)
        current_vertex = vertex
        while current_vertex != -1:
            if heights[current_vertex] != 0:
                break
            else:
                heights[current_vertex] = height
                height -= 1
                current_vertex = parent[current_vertex]
    return maxHeight