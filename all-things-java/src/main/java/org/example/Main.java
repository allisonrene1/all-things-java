package org.example;

import java.util.*;

public class Main {


    public boolean has23(int[] nums) {
        for(int number : nums) {
            if(number == 2 || number == 3) {
                return true;
            }
        }
        return false;
    }

    public String greeting(String name) {
        return "Hello " + name + "!";
    }

    public String wordInMiddle(String arrows, String word) {

        String first = arrows.substring(0, 2);
        String second = arrows.substring(2, 4);
        String finalOutput = first + word + second;
        return finalOutput;

    }

    public String firstHalf(String word) {
        return word.substring(0, word.length() / 2);
    }

    public List<String> sameOrder(String[] words) {

        List<String> newArrayList = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            newArrayList.add(words[i]);
        }

        return newArrayList;
    }


    public String[] list2Array(List<String> words) {

        String[] myNewString = new String[words.size()];

        for(int i = 0; i < words.size(); i++) {
            myNewString[i] = words.get(i);
        }

        return myNewString;
    }


    public List<String> no4LetterWords(String[] words) {

        List<String> myArrayList = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() != 4) {
                myArrayList.add(words[i]);
            }
        }
        return myArrayList;
    }

    public List<Double> intToDouble(int[] numbers) {

        List<Double> myArrayList = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            myArrayList.add((double) numbers[i] / 2);
        }

        return myArrayList;
    }

    public Map<String, String> animalGroups() {

        Map<String, String> animalMapping = new HashMap<>();

        animalMapping.put("wolves", "pack");
        animalMapping.put("lion", "pride");
        animalMapping.put("crow", "murder");

        return animalMapping;

    }

    public double isItOnSale(Map<String, Double> itemsOnSale, String itemNumber) {
        if(itemNumber == null || itemNumber.isEmpty()) {
            return 0.0;
        }

        Map<String, Double> caseSensitive = new HashMap<>();
        for(Map.Entry<String, Double> entry : itemsOnSale.entrySet()) {
            caseSensitive.put(entry.getKey().toLowerCase(), entry.getValue());
        }

        String lowerCaseItemNumber = itemNumber.toLowerCase();
        if(caseSensitive.containsKey(lowerCaseItemNumber)) {
            return caseSensitive.get(lowerCaseItemNumber);
        }
        return 0.0;

    }

    public String extraEnd(String str) {

        if(str.length() <= 2) {
            return str + str + str;
        } else {

            String string = str.substring(str.length() - 2);
            String finalString = string + string + string;
            return finalString;

        }

    }

    public String firstTwo(String word) {

        if(word.length() < 2) {
            return word;
        } else {
            return word.substring(0, 2);
        }

    }

    public String comboString(String firstWord, String secondWord) {

        if(firstWord.length() > secondWord.length()) {
            return secondWord + firstWord + secondWord;
        } else {
            return firstWord + secondWord + firstWord;
        }

    }


    public String nTwice(String word, int number) {

        String firstOutput = word.substring(0, number);
        String secondOutput = word.substring(word.length() - number);
        return firstOutput + secondOutput;

    }


    public String twoCharOutput(String word, int number) {

        if(number + 2 > word.length()) {
            return word.substring(0, 2);
        } else {
            String output = word.substring(number, number + 2);
            return output;

        }

    }

    public String middleThree(String word) {

        int middleStart = word.length() / 2;
        String newOuput = word.substring(middleStart -1, middleStart + 2);
        return newOuput;

    }
    

    public int largestValue(List<Integer> numbers) {

        int largestNumber = 0;


        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > largestNumber) {
                largestNumber = numbers.get(i);
            }
        }
        return largestNumber;

    }


    public static void main(String[] args) {

       Main mainInstance = new Main();

       String exampleWord1 = mainInstance.nTwice("chocolate", 1);
        System.out.println(exampleWord1);

        String exampleWord2 = mainInstance.twoCharOutput("java", 3);
        System.out.println(exampleWord2);

        String exampleWord3 = mainInstance.middleThree("solving");
        System.out.println(exampleWord3);

        List<Integer> exampleNumbers = new ArrayList<>(Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997));
        int exampleNumbers2 = mainInstance.largestValue(exampleNumbers);
        System.out.println(exampleNumbers2);


    }


}