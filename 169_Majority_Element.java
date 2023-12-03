// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) { 
        Integer a=null;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                a=nums[i];
                count=1;
            }
            else if(nums[i]==a){
                count++;
            }
            else{
                count--;
            }
        }
        return a;
    }
}
