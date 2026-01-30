public class LC283 {
    public static void moveZeroes(int[] nums) {
        int l = 0;

         for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                nums[l] = nums[r];
                l++;
            }
        }
        for (int r = l; r < nums.length; r++) {
            nums[r] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}