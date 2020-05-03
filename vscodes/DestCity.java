import java.util.ArrayList;
import java.util.List;
/**
 * 5400. 旅行终点站
 */
public class DestCity {
    public String destCity(List<List<String>> paths) {
        for(int i = 0;i<paths.size();i++) {
            List<String> li = paths.get(i);
            String end = li.get(1);
            for(int j = 0;j<paths.size();j++) {
                List<String> li_start = paths.get(j);
                String strt = li.get(0);
                if(!end.equals(strt)) {
                    return end;

                }
            }
        }
        return null;

    }
    public static void main(String[] args) {
       



    }

}
