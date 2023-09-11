package problems.leetcode.two_pointers;

public class ThreeSumTest {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] input = {-1,0,1,2,-1,-4};
        int[] input2 = {0,1,1};
        int[] input3 = {0,0,0};
        System.out.println("Test1: ");
        System.out.println(threeSum.threeSum(input));
        System.out.println("Test2: ");
        System.out.println(threeSum.threeSum(input2));
        System.out.println("Test3: ");
        System.out.println(threeSum.threeSum(input3));
    }
}
