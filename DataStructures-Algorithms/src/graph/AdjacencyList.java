package graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

	public static void main(String[] args) {
		int numVertices = 4;
        List<List<Integer> > edges = new ArrayList<>();
        edges.add(List.of(0, 1));
        edges.add(List.of(0, 2));
        edges.add(List.of(1, 2));
        edges.add(List.of(2, 3));
        edges.add(List.of(3, 1));
        List<List<Integer> > adjList  = createAdjacencyList(edges, numVertices);
        
        for(int i = 0; i<numVertices; i++)
        { 
        	System.out.print(i+" -> ");
        	for(int j = 0; j<adjList.get(i).size(); j++)
        	{
        		System.out.print(adjList.get(i).get(j)+" ");
        	}
        	System.out.println();
        }


	}
	
	public static List<List<Integer>> createAdjacencyList(List<List<Integer>> graph, int size)
	{
		
		List<List<Integer>> list = new ArrayList<List<Integer>>(size);
		
		for(int i = 0; i<size; i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		for (List<Integer> list2 : graph) {
			Integer u = list2.get(0);
			Integer v = list2.get(1);
			list.get(u).add(v);
			list.get(v).add(u);
		}
		
		return list;
	}

}
