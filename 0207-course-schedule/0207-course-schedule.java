class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
           ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
           for(int i = 0; i< numCourses; i++){
            graph.add(new ArrayList<>());
           }

           int[] indegree = new int[numCourses];
           for(int[] prereq: prerequisites){
            int course = prereq[0];
            int prereqCourse = prereq[1];
            graph.get(prereqCourse).add(course);
            indegree[course]++;
           } 

           Queue<Integer> queue = new LinkedList<>();
           for(int i = 0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
           }

        int processedCourse = 0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            processedCourse++;
            for(int neighbour: graph.get(current)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    queue.add(neighbour);
                }
            }
        }
        return processedCourse == numCourses;
    }
}