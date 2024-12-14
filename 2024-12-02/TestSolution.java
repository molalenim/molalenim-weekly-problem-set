public class TestSolution {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(sol.containsDuplicate(nums1)); // Expected: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(sol.containsDuplicate(nums2)); // Expected: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(sol.containsDuplicate(nums3)); // Expected: true
    }
}
