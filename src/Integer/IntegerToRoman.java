package Integer;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> symbolValues = createSymbolValuesMap();

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String> entry : symbolValues.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (num >= value) {
                sb.append(symbol);
                num -= value;
            }
        }
        return sb.toString();
    }

    private Map<Integer, String> createSymbolValuesMap() {
        Map<Integer, String> symbolValues = new LinkedHashMap<>();
        symbolValues.put(1000, "M");
        symbolValues.put(900, "CM");
        symbolValues.put(500, "D");
        symbolValues.put(400, "CD");
        symbolValues.put(100, "C");
        symbolValues.put(90, "XC");
        symbolValues.put(50, "L");
        symbolValues.put(40, "XL");
        symbolValues.put(10, "X");
        symbolValues.put(9, "IX");
        symbolValues.put(5, "V");
        symbolValues.put(4, "IV");
        symbolValues.put(1, "I");
        return symbolValues;
    }
}
