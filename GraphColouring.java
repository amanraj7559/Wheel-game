import java.util.*;
public class Main{
    static boolean isSafe(int node,int[] graph,int[] color,int c){
        for(int i=0;i<graph.length;i++){
            if(graph[node][i]==1&& color[i]==c){
                return false;
            }
        }
        return true;
    }
    static boolean solve(int node,int[][] graph,int m,int[] color){
        int n=graph.length;
        if(node==n){
            return true;
        }
        for(int c=1;c<=m;c++){
            if(isSafe(node,graph,m,color)){
                color[node]=c;
                if(solve(node+1,graph,m,color)){
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int[][] graph=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        int m=sc.nextInt();
        int[] color=new int[V];
        if(solve(0,graph,m,color)){
            System.out.println("colouring exists");
        }else{
            System.out.println("colouring does not exist");
        }
            
    
    }
}