import java.util.*;

public class GraphAdjacancyList {
  
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt(), v1, v2, index = 0;
        
        ArrayList<Integer> adjList[] = new ArrayList[n + 1];
        
        for (int i = 0; i < n + 1; i++) {
            adjList[i] = new ArrayList<Integer>(); 
        }
        
        for (int i = 0; i < m; i++) {
            v1 = input.nextInt();
            v2 = input.nextInt();
            
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }
        
        for (ArrayList<Integer> list: adjList) {
            System.out.println(index + "=>" + list);
            index++; 
        }
    }
}
