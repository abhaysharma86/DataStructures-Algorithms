package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		graph.add(new ArrayList<>(Arrays.asList(0,1,0,0)));
		graph.add(new ArrayList<>(Arrays.asList(1,0,1,0)));
		graph.add(new ArrayList<>(Arrays.asList(0,1,0,1)));
		graph.add(new ArrayList<>(Arrays.asList(0,0,1,0)));
		int numNode = graph.size();
		
		int[][] arr = adjacencyArrayToArrayMatrix(graph, numNode);
		
		for(int i = 0; i<numNode; i++)
		{
			for(int j = 0; j<numNode; j++)
			{
				System.out.print("["+arr[i][j]+"]");
			}
			System.out.println();
		}
	}
	
	
	public static int[][] adjacencyArrayToArrayMatrix(ArrayList<ArrayList<Integer>> graph, int numNode)
	{
		int[][] arr = new int[numNode][numNode];
		
		for(int i = 0; i < numNode; i++)
		{
			for(int j = 0; j<numNode; j++)
			{
				if(graph.get(i).get(j) == 1) {
					arr[i][j] = 1;
					arr[j][i] = 1;
				}
			}
		}
		
		return arr;
		
	}

}
