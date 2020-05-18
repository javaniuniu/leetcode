import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 5414. 收藏清单
 */
public class PeopleIndexes {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> ans = new ArrayList<>();
        int len = favoriteCompanies.size();
        Map<Integer, Set<String>> favorMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            favorMap.put(i, new HashSet(favoriteCompanies.get(i)));
        }

        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if (i == j)
                    continue;
                if (favorMap.get(j).containsAll(favorMap.get(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                ans.add(i);
        }
        return ans;

    }

   

}