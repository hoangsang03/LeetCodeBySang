package Codility;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NAB3 {

    public int solution(int[] A) {
        int result = -1;
        final int MAX_RESULT = 1_000_000_000;
        /**
         * step 0: inital map
         * step 1: valueApprearanceMap
         * step 2: sum of duplicate value
         * step 3: sum of miss value
         */
        Map<Integer, Integer> valueAppearanceMap = initialMap(A.length);

        getValueAppearanceMap(A,valueAppearanceMap);


        long sumDuplicateValues = sumDuplicateValues(valueAppearanceMap);
        long sumMissValues = sumMissValues(valueAppearanceMap);
        result = (int) Math.abs(sumMissValues-sumDuplicateValues);
        System.out.println("result: " + result);
        return result > MAX_RESULT ? -1 : result;
    }

    private void getValueAppearanceMap(int[] a, Map<Integer, Integer> integerIntegerMap) {
        for (int i = 0; i < a.length; i++) {
            if(integerIntegerMap.containsKey(a[i])){
                integerIntegerMap.put(a[i],integerIntegerMap.get(a[i]) + 1);
            } else {
                integerIntegerMap.put(a[i],1);
            }
        }
    }

    private long sumMissValues(Map<Integer, Integer> integerIntegerMap) {
        long sum = 0;
        for (Map.Entry<Integer,Integer> entry: integerIntegerMap.entrySet() ) {
            if(entry.getValue() == 0){
                sum += entry.getKey();
            }
        }
        return sum;
    }

    private long sumDuplicateValues(Map<Integer, Integer> integerIntegerMap) {
        long sum = 0;
        for (Map.Entry<Integer,Integer> entry: integerIntegerMap.entrySet() ) {
            if(entry.getValue() > 1){
                sum += entry.getKey()* (entry.getValue()-1);
            }
        }

        return sum;

    }

    private Map<Integer,Integer> initialMap(int size){
        Map<Integer,Integer> valueAppearanceMap = new ConcurrentHashMap<>();
        for (int i = 1; i <= size ; i++) {
            valueAppearanceMap.put(i,0);
        }
        return valueAppearanceMap;
    }
}
