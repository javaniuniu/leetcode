public class FindRadius {
    // [1,2,3,4],[1,4]
    public int findRadius(int[] houses, int[] heaters) {
        int heaters_len = 0;
        int left = heaters[0]-1;
        int right = houses[houses.length-1] - heaters[heaters.length-1];
        int max = Math.max(left, right);
        
        
        for(int i = 1;i<heaters.length;i++) {
            heaters_len = Math.max(heaters[i]-heaters[i-1], heaters_len);
        }
        int len_center = (heaters_len-1)/2 +(heaters_len-1)%2;
        return Math.max(max, len_center);
    }
    public static void main(String[] args) {
        int[] l1 = new int[]{1,2,3,5,15};
        int[] l2 = new int[]{2,30};
        FindRadius findRadius = new FindRadius();
        findRadius.findRadius(l1, l2);
    }
    
}