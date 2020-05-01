import java.util.ArrayList;
import java.util.List;

/**
 * 创建目标数组
 */
public class CreateTargetArray{
    private static CreateTargetArray createTargetArray = new CreateTargetArray();
    public int[] createTargetArray(int[] numbs, int[] index) {
        // 用于在列表的指定位置插入指定元素，并将当前处于该位置的元素及其后续元素的索引加 1
        List<Integer> list = new ArrayList<>();
        int[] res = new int[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            if (i>=index.length) {
                break;
            }
            list.add(index[i],numbs[i]);
        }
        for (int j=0;j<list.size();j++) {
            res[j]=list.get(j);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] numbs = new int[]{1,2,3,4,5,6};
        int[] numb2 = new int[]{1,2,3,4,5,6};
        createTargetArray.createTargetArray(numbs,numb2);

        
    }
}