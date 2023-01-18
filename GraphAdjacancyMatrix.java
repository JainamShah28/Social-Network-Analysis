import java.util.*;

public class GraphAdjacancyMatrix {
  
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt(), v1, v2;
        
        int adj[][] = new int[n + 1][n + 1];
        
        for (int i = 0; i < m; i++) {
            v1 = input.nextInt();
            v2 = input.nextInt();
            
            adj[v1][v2] = 1; 
            adj[v2][v1] = 1; 
        }
        
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(adj[i][j] + " ");
            }
            
            System.out.println(); 
        }
    }
}
