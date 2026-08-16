class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        return helper(graph, source, destination, visited);
    }

    public boolean helper(
        List<List<Integer>> graph,
        int source,
        int destination,
        boolean[] visited
    ) {

        if (source == destination) {
            return true;
        }

        visited[source] = true;

        for (int neighbor : graph.get(source)) {

            if (!visited[neighbor]) {

                if (helper(graph, neighbor, destination, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}