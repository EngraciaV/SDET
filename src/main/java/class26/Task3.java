package class26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy = new LinkedHashMap<>();
        bestBuy.put(67384378, "blender");
        bestBuy.put(378246382, "bed");
        bestBuy.put(47364982, "rose");
        bestBuy.put(89304501, "book");
        bestBuy.put(83737382, "mirror");

        var entrySet = bestBuy.entrySet();
        for (var e : entrySet) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
