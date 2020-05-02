import java.util.Arrays;

public class MajorityElement {
    private static MajorityElement majorityElement = new MajorityElement();
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,3,3};
        int mid = majorityElement.majorityElement(nums);
        System.out.println(mid);
    }
}