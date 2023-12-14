// 349. Intersection of Two Arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: nums1){
            hs1.add(i);
        }
        for(int i: nums2){
            hs2.add(i);
        }
        for(int i: hs2){
            if(!hs1.add(i)){
                al.add(i);
            }
        }
        int[] arr = new int[al.size()];
        int k=0;
        for(int i: al){
            arr[k] = i;
            k++;
        }
        return arr;
    }
}
