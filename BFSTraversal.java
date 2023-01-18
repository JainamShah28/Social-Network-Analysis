import java.util.*;

public class BFSTraversal {
  
    public static void bfs(ArrayList<ArrayList<Integer>> adjList, int startNode) {
        int n = adjList.size();
        ArrayList<Integer> result = new ArrayList<>(); 
        
        boolean visited[] = new boolean[n];  
        Arrays.fill(visited, false);
        visited[startNode] = true; 
        
        Queue<Integer> queue = new LinkedList<>(); 
        queue.offer(startNode); 
        
        while (!queue.isEmpty()) {
            int currentNode = queue.poll(); 
            result.add(currentNode);
            
            for (int node: adjList.get(currentNode)) {
                if (!visited[node]) {
                    visited[node] = true; 
                    queue.offer(node);
                } 
            }
        }
        
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
        
        bfs(adjList, startNode); 
    }
}
