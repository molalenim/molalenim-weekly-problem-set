import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i };
            }
            map.put(nums[i], i);

        }
        return new int[] {};

    }




    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("Test Case 1: " + Arrays.toString(result1)); // Expected indexes: [0, 1]

        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2,target2);
        System.out.println("Test Case 2: " + Arrays.toString(result2));// Expected [1,2]

        int[] nums3 = {3,3};
        int target3 = 6;
        int[] result3 = sol.twoSum(nums3, target3);
        System.out.println("Test Case 3: " + Arrays.toString(result3)); // Expected [0,1]
    }
}
