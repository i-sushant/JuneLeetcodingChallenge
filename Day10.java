class Solution {
    public int searchInsert(int[] nums, int target) {
        int x = Arrays.binarySearch(nums, target);
        return x < 0 ? Math.abs(x) - 1 : x;
    }
}