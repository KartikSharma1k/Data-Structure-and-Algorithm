class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a , b) -> Integer.compare(b,a));

        for(int i: stones){
            maxHeap.offer(i);
        }

        while(maxHeap.size() > 1){

            int y = 0; 
            int x = 0;

            y = maxHeap.poll();
            x = maxHeap.poll();

            if(x == 0) return y;

            int temp = y - x;
            
            if(temp > 0) maxHeap.offer(temp);

        }

        if(maxHeap.size() == 1) return maxHeap.poll();
    
        return 0;


    }
}