package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> symbolValues = createSymbolValuesMap();

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = symbolValues.get(currentSymbol);

            if (currentValue >= prevValue) {
                total += currentValue;
            } else {
                total -= currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    private Map<Character, Integer> createSymbolValuesMap() {
        Map<Character, Integer> symbolValues = new HashMap<>();
        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);
        return symbolValues;
    }
}
