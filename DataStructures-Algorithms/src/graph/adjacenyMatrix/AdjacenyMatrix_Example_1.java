package graph.adjacenyMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AdjacenyMatrix_Example_1 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		graph.add(new ArrayList<>(Arrays.asList(0,1,0,0)));
		graph.add(new ArrayList<>(Arrays.asList(1,0,1,0)));
		graph.add(new ArrayList<>(Arrays.asList(0,1,0,1)));
		graph.add(new ArrayList<>(Arrays.asList(0,0,1,0)));
		
		int[][] adjacenyMatrixArray = adjacenyMatrixArray(graph);
		
		for (int i = 0; i < adjacenyMatrixArray.length; i++) {
			for (int j = 0; j < adjacenyMatrixArray.length; j++) {
				System.out.print(adjacenyMatrixArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] adjacenyMatrixArray(ArrayList<ArrayList<Integer>> graph)
	{
		int size = graph.size();
		int[][] matrix = new int[size][size];
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if(graph.get(i).get(j) == 1)
				{
					matrix[i][j] = 1;
					matrix[j][i] = 1;
				}
			}
		}
		return matrix;
	}

}
