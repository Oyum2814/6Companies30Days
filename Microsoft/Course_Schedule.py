class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph = [[] for _ in range(numCourses)]
        in_degree = [0 for _ in range(numCourses)]
        for pair in prerequisites:
            x, y = pair
            graph[y].append(x)
            in_degree[x] += 1
        queue = []
        for i in range(numCourses):
            if in_degree[i] == 0:
                queue.append(i)
        while queue:
            curr = queue.pop(0)
            for neighbor in graph[curr]:
                in_degree[neighbor] -= 1
                if in_degree[neighbor] == 0:
                    queue.append(neighbor)
        for i in range(numCourses):
            if in_degree[i] > 0:
                return False
        return True
