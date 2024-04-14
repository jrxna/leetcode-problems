class TwoSum {
    public static void main(String args[]) {
        // Create Instances of the TestCase Class
        TestCase t1 = new TestCase();
        t1.nums = new int[]{2, 7, 11, 15};
        t1.target = 9;

        // Create Instance of the Solution Class
        Solution s = new Solution();

        // Call the twoSum function that returns an array of indices
        t1.result = s.twoSum(t1.nums, t1.target);

        // Print the result array to the console
        System.out.println(t1.result[0]);
        System.out.println(t1.result[1]);
    }
}

class TestCase {
    // TestCase Input
    public int[] nums;
    public int target;

    // TestCase Output
    public int[] result;
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}