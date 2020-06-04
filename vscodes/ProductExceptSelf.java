/**
 * 238. 除自身以外数组的乘积
 */
public class ProductExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for(int i=nums.length-1;i>=0;i--) {
            k *= nums[i];
            res[i] = k;
        }
        k = 1;
        for(int i = 0;i<nums.length-1;i++) {
            res[i] = k * res[i+1];
            k *= nums[i];
        }
        res[nums.length-1] = k;
        return res;

    }
    public static void main(String[] args) {
        ProductExceptSelf  p = new ProductExceptSelf();
        int[] nums = new int[]{1,2,3,4};
        p.productExceptSelf(nums);

    }
}