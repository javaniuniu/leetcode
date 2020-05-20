import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int count = 0;
        for(int i=1;i<=n;i++) {
            list.add("Push");
            if(i== target[target.length-1]){
                break;
            }
            
            if(i==target[count]) {
                count++;
                continue;
            }else{
                list.add("Pop");
            }
            
        }

        return list;
        
    }
    public static void main(String[] args) {
        BuildArray bArray = new BuildArray();
        int[] target = new int[]{1,3};
        System.out.println(bArray.buildArray(target,3));
    }
    
}