public class KLengthApart {
    private static KLengthApart kLengthApart = new KLengthApart();
    public boolean kLengthApart(int[] nums, int k) {
        int last = -k -1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                if (i - last <= k)
                    return false;
                last = i;
            }
                
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,0,0,1,0,0,1};
        int k = 2;
        kLengthApart.kLengthApart(nums, k);
    }
    
}