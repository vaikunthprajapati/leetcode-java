class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0;
        int count1 = 0;
        for( int student: students){
            if( student == 1){
                count1++;
            }
            else{
                count0++;
            }
        }
        for( int sandwich: sandwiches){
            if(sandwich == 1){
                if(count1 == 0){
                    break;
                }
                count1--;
            }
            else{
                if(count0 == 0){
                    break;
                }
                count0--;
            }
        }
        return count0 + count1;
    }
}

