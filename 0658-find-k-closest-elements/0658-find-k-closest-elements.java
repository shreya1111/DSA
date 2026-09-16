class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int distA= Math.abs(a-x);
            int distB= Math.abs(b-x);

            if(distA!=distB){
                return Integer.compare(distB,distA);
            }     

            return Integer.compare(b,a);
        }    
        );       

        for(int num:arr){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> result=new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        Collections.sort(result);
        return result;
    }
}