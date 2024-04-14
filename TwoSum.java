class TwoSum {
    public static void main(String args[]) { 
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        // Call the twoSum function that returns an array of indices
        int[] result = twoSum(nums, target);

        // Print the result array to the console
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
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