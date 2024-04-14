public class TwoSum {
    public static void main(String args[]) {
        // Create Instances of the TestCase Class
        TestCase t1 = new TestCase(new int[]{2, 7, 11, 15}, 9);
        TestCase t2 = new TestCase(new int[]{3, 2, 4}, 6);
        TestCase t3 = new TestCase(new int[]{3, 3}, 6);

        // Create Instance of the Solution Class
        Solution s = new Solution();

        /* Even though the twoSum() method can directly consume
         * the instance of the TestCase class and directly alter
         * the value of the result member of the TestCase object,
         * the following is done since LeetCode only expects the 
         * solution function and nothing else.
         */
        t1.result = s.twoSum(t1.nums, t1.target);
        t2.result = s.twoSum(t2.nums, t2.target);
        t3.result = s.twoSum(t3.nums, t3.target);

        // Print the result array to the console
        t1.printResult();
        t2.printResult();
        t3.printResult();
    }
}

class TestCase {
    // TestCase Input
    public int[] nums;
    public int target;

    // TestCase Output
    public int[] result;

    TestCase(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        this.result = new int[2];
    }

    public void printResult() {
        for(int i = 0; i < this.result.length; i++) {
            System.out.println(this.result[i]);
        }
    }
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