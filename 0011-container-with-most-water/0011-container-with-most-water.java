class Solution {
    public int maxArea(int[] height) {
        
        int max = Integer.MIN_VALUE;

        int front = 0, rear = height.length-1;

        while(front < rear){

            if(height[front] < height[rear]){

                max = Math.max(max, height[front] * (rear - front));
                front++;

            } else{

                max = Math.max(max, height[rear] * (rear - front));
                rear--;

            }

        }


        return max;

    }
}