class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List ans = new ArrayList<Integer>();
        int target = 0, currSum = 0, left = 0, mid = left+1, right = nums.length-1;

        Arrays.sort(nums);

        while(left < mid){

            mid = left+1;
            right = nums.length-1;

            while(mid < right){

                currSum = nums[left] + nums[mid] + nums[right];

                if(currSum == target){
                    List temp = new ArrayList<Integer>();
                    temp.add(nums[left]);
                    temp.add(nums[mid]);
                    temp.add(nums[right]);

                    ans.add(temp);

                    mid = mid+1;
                    while(nums[mid] == nums[mid-1] && mid < right) mid = mid+1;
                    right = right-1;
                    while(nums[right] == nums[right+1] && right > mid) right = right-1;
                }else if(currSum < target){
                    mid = mid+1;
                    while(nums[mid] == nums[mid-1] && mid < right) mid = mid+1;
                }else{
                    right = right-1;
                    while(nums[right] == nums[right+1] && right > mid) right = right-1;
                }


            }

            left = left+1;
            while(nums[left] == nums[left-1] && left < nums.length-1) left = left+1;

        }
        
        return ans;

    }
}