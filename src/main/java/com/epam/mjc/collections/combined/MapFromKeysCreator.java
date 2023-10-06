package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> finalMap = new HashMap<>();
        for (String key: sourceMap.keySet()) {
            int newKey = key.length();
            Set<String> newValue = new HashSet<>();
            for (String value: sourceMap.keySet()) {
                if (value.length() == newKey){
                    newValue.add(value);
                }
            }
            finalMap.put(newKey, newValue);
        }
        return finalMap;
    }
}
