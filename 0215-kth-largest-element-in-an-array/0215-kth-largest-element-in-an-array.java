class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pd= new PriorityQueue<>();
        for(int num :nums){
            pd.add(num);
            if(pd.size()>k){
                pd.poll();
            }
        }
        return pd.peek();
    }
}