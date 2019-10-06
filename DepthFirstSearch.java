import java.util.ArrayList;
import java.util.List;

/**
 * Node Class
 * @author asharda
 *
 */
class Node
{
	int data;
	boolean visited;
	List<Node> neighbours;
	Node(int data)
	{
		this.data=data;
		neighbours=new ArrayList<Node>();
		
	}
	/**
	 * Add Neighbours
	 * @param neighbour
	 */
	public void addNeightbours(Node neighbour)
	{
		this.neighbours.add(neighbour);
	}
	
	/**
	 * Get All Neighbours
	 * @return List<Node>
	 */
	public List<Node> getNeighbours()
	{
		return neighbours;
	}
	

}

/**
 * Depth First Search
 * @author asharda
 *
 */
public class DepthFirstSearch {

	/**
	 * DFS
	 * @param node
	 */
	public void DFS(Node node)
	{
		System.out.println("Node data seen is "+node.data);
		List<Node>neighbours=node.getNeighbours();
		node.visited=true;
		for(int i=0;i<neighbours.size();i++)
		{
			Node n=neighbours.get(i);
			if(!n.visited && n!=null)
			{
				DFS(n);
			}
		}
	}
	public static void main(String[] args) {

		Node node10=new Node(10);
		node10.addNeightbours(new Node(20));
		DepthFirstSearch dfs=new DepthFirstSearch();
		dfs.DFS(node10);
		
	}

}
