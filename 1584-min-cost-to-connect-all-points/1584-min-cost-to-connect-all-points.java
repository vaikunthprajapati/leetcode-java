class Solution {
       private static final int infinity = Integer.MAX_VALUE;
    public int minCostConnectPoints(int[][] points) {
        int numVertices = points.length;
        int[] key = new int[numVertices];
        boolean[] visited = new boolean[numVertices];
        Arrays.fill(key, infinity);
        key[0] = 0;
        int totalCost = 0;
        for(int i = 0; i<numVertices; i++){
            int minVertice = findMinIndex(key,visited);
            visited[minVertice] = true;
            totalCost += key[minVertice];
            for(int j = 0; j<numVertices; j++){
                if(!visited[j]){
                    int distance = Math.abs(points[minVertice][0] - points[j][0]) + Math.abs(points[minVertice][1] - points[j][1]);
                    if(distance<key[j]){
                        key[j] = distance;
                    }
                }
            }
        }
        return totalCost;
    }


    public static int findMinIndex(int[] key, boolean[] visited){
        int minIndex = infinity;
        int minVertice = -1;
        for(int i = 0; i<key.length; i++){
            if(!visited[i] && key[i]<minIndex){
                minIndex = key[i];
                minVertice = i; 
            }
        }
        return minVertice;
    }
}