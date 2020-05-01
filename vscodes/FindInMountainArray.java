public class FindInMountainArray {
    private static FindInMountainArray findInMountainArray = new FindInMountainArray();
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int lo =0,hi = mountainArr.length(),top=0;
        int[] res = new int[]{-1,-1};
        // 判断最高峰
        while(lo<hi) {
            int mid = lo+ (hi-lo)/2;
            if (mountainArr.get(mid)>mountainArr.get(mid-1)) 
                lo = mid+1;
            else if(mountainArr.get(mid)<mountainArr.get(mid-1))
                hi = mid;

        }
        top = lo-1;
        lo = 0;
        hi = top;

        // 左半
        while(lo<hi){
            int mid = lo+ (hi-lo)/2;
            if (mountainArr.get(mid)==target)
                res[0] = mid;
            if (mountainArr.get(mid)>target)
                hi = mid;
            else
                lo = mid+1;
        }

        hi = mountainArr.length();
        lo = top;
        // 右半
        while(lo<hi){
            int mid = lo+ (hi-lo)/2;
            if (mountainArr.get(mid)==target)
                res[1] = mid;
            if (mountainArr.get(mid)>target)
                lo = mid+1;
            else
                hi = mid;
        }
        if (res[0]==-1)
            return res[1];
        return res[0];
        
    }

    public int findInMount(int target,int[] mountain) {
        int lo =0,hi = mountain.length,top=0;
        int[] res = new int[]{-1,-1};
        // 判断最高峰
        while(lo<hi) {
            int mid = lo+ (hi-lo)/2;
            if (mountain[mid]>mountain[mid-1]) 
                lo = mid+1;
            else if(mountain[mid]<mountain[mid-1])
                hi = mid;

        }
        top = lo-1;
        lo = 0;
        hi = top;

        // 左半
        while(lo<hi){
            int mid = lo+ (hi-lo)/2;
            if (mountain[mid]==target)
                res[0] = mid;
            if (mountain[mid]>target)
                hi = mid;
            else
                lo = mid+1;
        }

        hi = mountain.length;
        lo = top;
        // 右半
        while(lo<hi){
            int mid = lo+ (hi-lo)/2;
            if (mountain[mid]==target)
                res[1] = mid;
            if (mountain[mid]>target)
                lo = mid+1;
            else
                hi = mid;
        }
        if (res[0]==-1)
            return res[1];
        return res[0];
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,5,2};
        int target = 0;
        int top = findInMountainArray.findInMount(target,array);
        System.out.println(top);
        
        
    }
}

