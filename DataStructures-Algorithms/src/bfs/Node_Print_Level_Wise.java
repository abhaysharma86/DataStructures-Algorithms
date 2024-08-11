package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Node_Print_Level_Wise {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i<8; i++)
		{
			graph.add(new ArrayList<>());
		}

		
		addNode(graph, 0, 1);
		addNode(graph, 0, 2);
		addNode(graph, 0, 3);
		addNode(graph, 1, 4);
		addNode(graph, 1, 5);
		addNode(graph, 2, 6);
		addNode(graph, 3, 7);
		
		System.out.println("Graph Adjacency List\n");
		
		int i = 0;
		for (ArrayList<Integer> arrayList : graph) {
			System.out.println(i+" = "+ arrayList);
			i++;
		}
		System.out.println("\n********** BFS ***************\n");
		printLevel(graph);
	}
	
	public static void addNode(ArrayList<ArrayList<Integer>> graph, int u, int v)
	{
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	public static void printLevel(ArrayList<ArrayList<Integer>> graph)
	{
		
		boolean visited[] = new boolean[graph.size()];
		Queue<Integer> queue = new LinkedList<>();
		
		visited[0] = true;
		queue.add(0);
		
		while (!queue.isEmpty()) {
			Integer poll = queue.poll();
			System.out.print("["+ poll +"]");
			ArrayList<Integer> arrayList = graph.get(poll);
			for (Integer integer : arrayList) {
				if(visited[integer] == false) {
					visited[integer] = true;
					queue.add(integer);
				}
			}
		}
		
	}
	

}
