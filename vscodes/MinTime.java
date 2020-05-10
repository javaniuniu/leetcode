import java.util.ArrayList;
import java.util.List;

public class MinTime {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<Integer> lIntegers = new ArrayList<>();
        int count = 0;
        for(int i=0;i<hasApple.size();i++){
            if(hasApple.get(i)) {
                for (int[] list:edges) {
                    if (list[1] == i) {
                        lIntegers.add(i);
                    }
                     list[1] = i;
                    int idx = edges[0][i];
                }
                
                
            }
        }

        return 0;
    }

}