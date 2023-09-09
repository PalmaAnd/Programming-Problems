package problems.leetcode.arrays_hashing;

import java.util.Arrays;

public class ProductExceptSelfTest {
    public static void main(String[] args) {
        ProductExceptSelf productObject = new ProductExceptSelf();
        int[] input = {1,2,3,4};
        System.out.println(Arrays.toString(productObject.productExceptSelf(input)));
        System.out.println(Arrays.toString(productObject.productExceptSelfBruteForce(input)));
        int[] input2 =  {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productObject.productExceptSelf(input2)));
        System.out.println(Arrays.toString(productObject.productExceptSelfBruteForce(input2)));
    }
}
