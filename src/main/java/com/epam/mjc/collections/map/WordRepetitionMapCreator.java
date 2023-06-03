package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        System.out.println(sentence);
        Map<String,Integer> countRepetition = new HashMap<>();

        if (sentence == null || sentence.length() == 0) return countRepetition;
        String[] splittedSentence = sentence.split(" ");
        for(String word: splittedSentence){
            word = word.toLowerCase().trim();
            Character ch = checkWordContainingNotAlpha(word);
            if(ch != null) {
                word = word.substring(0, word.indexOf(ch));

            }
            if(countRepetition.containsKey(word))
                countRepetition.put(word.toLowerCase(), countRepetition.get(word)+1);
            else {

                countRepetition.put(word, 1);
            }
        }
        return countRepetition;
    }

    private Character checkWordContainingNotAlpha(String word){
        for(Character ch : word.toCharArray()){
            if(!Character.isAlphabetic(ch)){
                return ch;
            }
        }
        return null;

    }
}
