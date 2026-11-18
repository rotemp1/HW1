public class Assignment01Q05 {


    public static int findShortestPath(int[][] m, int i, int j) {
        int len = m.length;
        // we will do a simple bfs!
        int[] min_dist = new int[len]; for(int a=0;a<len;a++) min_dist[a]=-1;
        int[] is_visited = new int[len];
        min_dist[i]=0;
        int cur= 0;
        while(cur !=-1){
            cur = -1;
            for(int a=0;a<len;a++){ //find new min;
                if(is_visited[a]==0 && min_dist[a]!=-1){
                    if(cur==-1) cur=a;
                    else if(min_dist[a] < min_dist[cur]) cur = a;
                }
            } if(cur ==-1){break;}
            is_visited[cur] = 1;
            for(int a=0;a<len;a++){
                if(m[cur][a]==1 && is_visited[a]==0){
                    if(min_dist[a]==-1) min_dist[a] = min_dist[cur]+1;
                    else
                        min_dist[a] = Math.min(min_dist[cur]+1, min_dist[a]);
                    
                }
            }
        }
        if(min_dist[j]!=-1){return min_dist[j];}
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}