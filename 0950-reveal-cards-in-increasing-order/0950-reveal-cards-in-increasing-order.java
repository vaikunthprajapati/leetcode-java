class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] arr = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<deck.length; i++){
            q.add(i);
        }
        for(int i = 0; i<deck.length; i++){
            arr[q.remove()]=deck[i];
            if(!q.isEmpty()){
            q.add(q.remove());
            }
        }
        return arr;
    }
}