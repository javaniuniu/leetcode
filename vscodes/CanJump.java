public class CanJump {
    public boolean canJump(int[] nums){
        for (int i = 0;i<nums.length;i++) {
            if(nums[i]==0)
                if(passZero(nums,i))
                    continue;
                else
                    return false;
        }
        return true;
    }
    //判断是否能跳出当前0
    public static boolean passZero(int[] nums,int i) {
        for(int j=0;j<i;j++) { // 在 i 之前找到能跳过 0 的下标
            if(j+nums[i]>i)
                return true;
        }
        return false;
    }
}