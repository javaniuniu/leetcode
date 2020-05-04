public class Jump {
    private static Jump jump = new Jump();
    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        jump.jump(nums);
        
    }
}