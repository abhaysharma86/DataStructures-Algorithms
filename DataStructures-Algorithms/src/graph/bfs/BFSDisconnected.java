package graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSDisconnected {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < 6; i++)
        {
            adj.add(new ArrayList<>());
        }
        buildGraph(adj, 0,1);
        buildGraph(adj, 0,2);
        buildGraph(adj, 4,3);
        buildGraph(adj, 4,5);
        BFSDisconnectedGraph(adj);

    }
    public static void BFSDisconnectedGraph(List<List<Integer>> adj)
    {
        boolean[] visited = new boolean[6];
        for (int i = 0; i < adj.size(); i++){
            if(!visited[i]){
                buildNodeGraph(adj, i, visited);
            }
        }
    }

    public static void buildGraph(List<List<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void buildNodeGraph(List<List<Integer>> adj, int start, boolean[]visited)
    {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            System.out.println(poll);
            for (Integer value : adj.get(poll))
            {
                if(!visited[value]){
                    visited[value] = true;
                    queue.add(value);
                }
            }
        }
    }
}
