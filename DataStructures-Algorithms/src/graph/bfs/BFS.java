package graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            adj.add(new ArrayList<>());
        }
        buildGraph(adj,0,1);
        buildGraph(adj,0,2);
        buildGraph(adj,1,2);
        buildGraph(adj,1,3);
        buildGraph(adj,2,4);
        buildGraph(adj,3,4);
        System.out.println("BFS starting from 0:");
        bfsBuild(adj, 0);
    }
    public static void buildGraph(List<List<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void bfsBuild(List<List<Integer>> adj, int start)
    {
        Queue<Integer> node = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];

        node.add(start);
        visited[start] = true;

        while (!node.isEmpty()){
            int poll = node.poll();
            System.out.println(poll);
            for(int value : adj.get(poll))
            {
                if(!visited[value]){
                    visited[value] = true;
                    node.add(value);
                }
            }
        }
    }
}


// Time Complicity is O(V+E)
// Space Complicity is O(V)