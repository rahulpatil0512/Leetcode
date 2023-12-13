// 179. Largest Number

class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length == 0) return "";
        Integer[] numsTemp = new Integer[nums.length];
        boolean allZeros = true;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) allZeros = false;
            Integer temp = new Integer(nums[i]);
            numsTemp[i] = temp;
        }
        Arrays.sort(numsTemp, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                StringBuilder s1 = new StringBuilder();
                String str1 = s1.append(num1).append(num2).toString();
 
                s1.delete(0, s1.length());
                String str2 = s1.append(num2).append(num1).toString();
    
                return str2.compareTo(str1);
            }
        });
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < numsTemp.length; i++) {
            s.append(numsTemp[i]);
        }
        return allZeros? "0": s.toString();
    }
}
