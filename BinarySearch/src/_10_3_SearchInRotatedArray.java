public class _10_3_SearchInRotatedArray {
    public int searchInRotatedArray(int[] nums, int target){
        int lo = 0, hi = nums.length - 1, mid = (lo + hi) / 2;

        while (lo <= hi){
            if (nums[mid] < target){
                lo = mid + 1;
            } else {
                hi = mid + 1;
            }
            return mid;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] input = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int target = 5;
        _10_3_SearchInRotatedArray test = new _10_3_SearchInRotatedArray();
        int result = test.searchInRotatedArray(input, target);
        System.out.print(result);
    }
}
