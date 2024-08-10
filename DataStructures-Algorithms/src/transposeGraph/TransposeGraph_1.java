package transposeGraph;

import java.util.ArrayList;
import java.util.Arrays;

public class TransposeGraph_1 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph =new ArrayList<ArrayList<Integer>>();
		
		graph.add(new ArrayList<>(Arrays.asList(0,1,0,1,1)));
		graph.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
		graph.add(new ArrayList<>(Arrays.asList(1,0,0,0,0)));
		graph.add(new ArrayList<>(Arrays.asList(0,0,1,0,0)));
		graph.add(new ArrayList<>(Arrays.asList(0,1,0,1,0)));
		 
		int[][] matrixGraph = matrixGraph(graph);
		
		System.out.println("Array Matrix\n");
		
		for(int i = 0; i < matrixGraph.length; i++)
		{
			for(int j = 0; j < matrixGraph.length; j++)
			{
				System.out.print("["+matrixGraph[i][j]+"]");
			}
			System.out.println();
		}
		
		System.out.println("\n*****************************************");
		
		System.out.println("Array Matrix Tanspose\n");
		
		
       int[][] transposeGraph = transposeGraph(graph);
		
		for(int i = 0; i < transposeGraph.length; i++)
		{
			for(int j = 0; j < transposeGraph.length; j++)
			{
				System.out.print("["+transposeGraph[i][j]+"]");
			}
			System.out.println();
		}
		
		

	}
	
	public static int[][] matrixGraph(ArrayList<ArrayList<Integer>> graph)
	{
		
		int[][] gArray = new int[graph.size()][graph.size()];
		
		for(int i = 0; i < graph.size(); i++)
		{
			for(int j = 0; j < graph.size(); j++)
			{
				if(graph.get(i).get(j) == 1) {
					gArray[i][j] = 1;					
				}
			}
		}
		
		return gArray;
	}
	
	public static int[][] transposeGraph(ArrayList<ArrayList<Integer>> graph)
	{
		
		int[][] gArray = new int[graph.size()][graph.size()];
		
		for(int i = 0; i < graph.size(); i++)
		{
			for(int j = 0; j < graph.size(); j++)
			{
				if(graph.get(i).get(j) == 1) {
					gArray[j][i] = 1;					
				}
			}
		}
		
		return gArray;
	}

}
