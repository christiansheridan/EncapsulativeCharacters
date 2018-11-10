package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import static java.util.Comparator.comparing;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class WC {
    private Iterator<String> si;
    private Map<String, Integer> countOfWords = new HashMap<String, Integer>();

    public WC(String fileName) {

        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public void wordMap() {
        while (si.hasNext()) {
            String word = si.next().toLowerCase();
            String newWord = word.replaceAll("[^a-z]", "");
            Integer count = countOfWords.get(word);
            if (count != null) {
                countOfWords.put(newWord, count + 1);
            } else {
                countOfWords.put(newWord, 1);
            }
        }
    }

    public Integer getWordCount(String str){
        for (String word: countOfWords.keySet()
             ) {
            if (str.equals(word)){
                return countOfWords.get(word);
            }
        } return -1;
    }


    public void printMap() {
        countOfWords.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(stringIntegerEntry->
                        System.out.println(stringIntegerEntry.getKey() + " is used " +stringIntegerEntry.getValue() + " time(s)"));
        }
    }
