public class PalindromeNumber {
    public static void main(String args[]) {
        // Create Instances of the TestCase Class
        TestCase t1 = new TestCase(121);
        TestCase t2 = new TestCase(-121);
        TestCase t3 = new TestCase(10);

        // Create Instance of the Solution Class
        Solution s = new Solution();

        /* Even though the isPalindrome() method can directly consume
         * the instance of the TestCase class and directly alter
         * the value of the result member of the TestCase object,
         * the following is done since LeetCode only expects the 
         * solution function and nothing else.
         */
        t1.result = s.isPalindrome(t1.x);
        t2.result = s.isPalindrome(t2.x);
        t3.result = s.isPalindrome(t3.x);

        // Print the result array to the console
        t1.printResult();
        t2.printResult();
        t3.printResult();
    }
}

class TestCase {
    // TestCase Input
    public int x;

    // TestCase Output
    public boolean result;

    TestCase(int x) {
        this.x = x;
    }

    public void printResult() {
        System.out.println(this.result); 
    }
}


class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        int rev = 0, temp = x;

        while(temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (rev == x) return true;
        else return false;
    }
}