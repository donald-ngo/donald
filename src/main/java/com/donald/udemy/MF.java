package com.donald.udemy;

import java.util.HashMap;

public class MF {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.
        
        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
    }

    // Implement your solution below.
    public static Integer mostFreqent(int[] givenArray) {
        Integer maxItem = null;
        
        if (givenArray.length == 0){
            return maxItem;
        }
        
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        for ( Integer item : givenArray){
              if (numMap.containsKey(item)) {
                  numMap.put(item,numMap.get(item) + 1);
              }
              else{
                  numMap.put(item,1);
              }
        }
        
        Integer maxCount = 1;
        for (Integer item: numMap.keySet()){
            if (numMap.get(item) >= maxCount ){
                maxItem = item;
                maxCount = numMap.get(item);
            }
        }
        
        return maxItem;
    }
}
