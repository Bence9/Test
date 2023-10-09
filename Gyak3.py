
GRAPH = {
    "S": ["A", "B"],
    "A": ["S", "B", "D"],
    "B": ["A", "C", "S"],
    "C": ["B", "E"],
    "D": ["A", "G"],
    "E": ["C"]
}

def dfs(graph, start, goal, path=None):
# deep - first algorithm
    if path is None:
        path = []
    path = path + [start]
    if start == goal:
        return path
    for neighbor in graph.get(start, []):
        if neighbor not in path:
            new_path = dfs(graph, neighbor, goal, path)
            if new_path is not None:
                return new_path
    return None

result = dfs(GRAPH, "S", "G")
print(result)