import java.util.*;

public class DFSTraversal {
  
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean visited[], ArrayList<Integer> result) {
        visited[node] = true; 
        result.add(node);
        
        for (int value: adjList.get(node)) {
            if (!visited[value]) {
                dfs(value, adjList, visited, result); 
            }
        }
    }
    
    public static void dfsOfGraph(ArrayList<ArrayList<Integer>> adjList, int startNode) {
        int n = adjList.size();
        ArrayList<Integer> result = new ArrayList<>(); 
        
        boolean visited[] = new boolean[n];  
        Arrays.fill(visited, false);
        visited[startNode] = true; 
        
        dfs(startNode, adjList, visited, result); 
        System.out.println(result); 
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt(), v1, v2, index = 0, startNode;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        for (int i = 0; i < n + 1; i++) {
            adjList.add(new ArrayList<Integer>()); 
        }
        
        for (int i = 0; i < m; i++) {
            v1 = input.nextInt();
            v2 = input.nextInt();
            
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1);
        }
        
        startNode = input.nextInt(); 
        
        dfsOfGraph(adjList, startNode); 
    }
}
