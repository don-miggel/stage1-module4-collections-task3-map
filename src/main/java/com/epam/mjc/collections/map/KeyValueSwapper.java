package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> resMap = new HashMap<>();
        for(Integer item : sourceMap.keySet()){
            Integer lowestVal = Collections.min(extractKeyRelatedToOneVal(sourceMap, sourceMap.get(item)));
            resMap.put(sourceMap.get(item), lowestVal);

        }

        return resMap;
    }

    private ArrayList<Integer> extractKeyRelatedToOneVal(Map<Integer, String> map, String val){
        ArrayList<Integer> keysRefined = new ArrayList<>();
        Set<Integer> keys = map.keySet();
        String value = null;
        for(Integer key : keys){
           if(map.get(key).toLowerCase().equals(val.toLowerCase()))
               keysRefined.add(key);

        }
        return  keysRefined;
    }
}
