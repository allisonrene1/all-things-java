package org.example;

import java.util.*;

public class Main {


    public boolean has23(int[] nums) {
        for (int number : nums) {
            if (number == 2 || number == 3) {
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

        for (int i = 0; i < words.length; i++) {
            newArrayList.add(words[i]);
        }

        return newArrayList;
    }


    public String[] list2Array(List<String> words) {

        String[] myNewString = new String[words.size()];

        for (int i = 0; i < words.size(); i++) {
            myNewString[i] = words.get(i);
        }

        return myNewString;
    }


    public List<String> no4LetterWords(String[] words) {

        List<String> myArrayList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != 4) {
                myArrayList.add(words[i]);
            }
        }
        return myArrayList;
    }

    public List<Double> intToDouble(int[] numbers) {

        List<Double> myArrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
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
        if (itemNumber == null || itemNumber.isEmpty()) {
            return 0.0;
        }

        Map<String, Double> caseSensitive = new HashMap<>();
        for (Map.Entry<String, Double> entry : itemsOnSale.entrySet()) {
            caseSensitive.put(entry.getKey().toLowerCase(), entry.getValue());
        }

        String lowerCaseItemNumber = itemNumber.toLowerCase();
        if (caseSensitive.containsKey(lowerCaseItemNumber)) {
            return caseSensitive.get(lowerCaseItemNumber);
        }
        return 0.0;

    }

    public String extraEnd(String str) {

        if (str.length() <= 2) {
            return str + str + str;
        } else {

            String string = str.substring(str.length() - 2);
            String finalString = string + string + string;
            return finalString;

        }

    }

    public String firstTwo(String word) {

        if (word.length() < 2) {
            return word;
        } else {
            return word.substring(0, 2);
        }

    }

    public String comboString(String firstWord, String secondWord) {

        if (firstWord.length() > secondWord.length()) {
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

        if (number + 2 > word.length()) {
            return word.substring(0, 2);
        } else {
            String output = word.substring(number, number + 2);
            return output;

        }

    }

    public String middleThree(String word) {

        int middleStart = word.length() / 2;
        String newOuput = word.substring(middleStart - 1, middleStart + 2);
        return newOuput;

    }


    public int largestValue(List<Integer> numbers) {

        int largestNumber = 0;


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largestNumber) {
                largestNumber = numbers.get(i);
            }
        }
        return largestNumber;

    }

    public List<Integer> oddOnly(int[] arrayOfIntegers) {

        List<Integer> myNewList = new ArrayList<>();

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] % 2 == 1) {
                myNewList.add(arrayOfIntegers[i]);
            }
        }
        return myNewList;
    }


    public boolean foundTwice(List<Integer> listOfIntegers, int value) {

        int counter = 0;

        for (int i = 0; i < listOfIntegers.size(); i++) {
            if (listOfIntegers.get(i) == value) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        } else {
            return false;
        }

    }

    public List<Integer> interWovenList(List<Integer> listOne, List<Integer> listTwo) {

        List<Integer> myNewList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < listOne.size() && j < listTwo.size()) {
            myNewList.add(listOne.get(i));
            myNewList.add(listTwo.get(j));
            i++;
            j++;
        }

        while (i < listOne.size()) {
            myNewList.add(listOne.get(i));
            i++;
        }

        while (j < listTwo.size()) {
            myNewList.add(listTwo.get(j));
            j++;
        }

        return myNewList;

    }

    public double isItOnSaleTho(Map<String, Double> itemNames, String itemNumber) {
        if(itemNumber == null || itemNumber.isEmpty()) {
            return 0.0;
        }

        Map<String, Double> checkCaseSensitive = new HashMap<>();
        for(Map.Entry<String, Double> saleItem : itemNames.entrySet()) {
            checkCaseSensitive.put(saleItem.getKey().toLowerCase(), saleItem.getValue());
        }

        String lowerCaseItemNumber = itemNumber.toLowerCase();
        if(checkCaseSensitive.containsKey(lowerCaseItemNumber)) {
            return checkCaseSensitive.get(lowerCaseItemNumber);
        }
        return 0.0;
    }



    public List<String> fizzBuzzList(int[] integers) {

        List<String> fizzBuzzList = new ArrayList<>();

        for(int i = 0; i < integers.length; i ++) {
            if(integers[i] % 3 == 0 && integers[i] % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (integers[i] % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else if(integers[i] % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else {
                fizzBuzzList.add(String.valueOf(integers[i]));
            }
        }

        return fizzBuzzList;

    }

    /*
     * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
     * but only if Paul has less than $10.
     *
     * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
     *
     * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
     * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
     * robPeterToPayPaul({"Peter": 101, "Paul": 500}) → {"Peter": 51, "Paul": 550}
     * robPeterToPayPaul({"Peter": 0, "Paul": 500}) → {"Peter": 0, "Paul": 500}
     *
     */

    public Map<String, Integer> peterToPayPaul(Map<String, Integer> theMoney) {


        if(theMoney.containsKey("Peter") && theMoney.containsKey("Paul")) {
            int petersMoney = theMoney.get("Peter");
            int paulsMoney = theMoney.get("Paul");

            if(petersMoney > 0 && paulsMoney < 1000) {
                int transferMoney = petersMoney / 2;
                theMoney.put("Paul", paulsMoney + transferMoney);
                theMoney.put("Peter", petersMoney - transferMoney);
            }

        }

        return theMoney;
    }


    public int[] makeLast(int[] numbers) {

        int[] newArrayNums = new int[numbers.length * 2];

        newArrayNums[newArrayNums.length - 1] = numbers[numbers.length -1];

        return newArrayNums;

    }
    


    public int[] makeEnds(int[] numbers) {

       int firstHalf = numbers[0];
       int secondHalf = numbers[numbers.length - 1];
       int[] finalResult = {firstHalf, secondHalf};
       return finalResult;

    }


    public static void main(String[] args) {

       Main mainInstance = new Main();

        int[] exampleNumbers1 = {7, 4, 6, 2};
        int[] exampleNumbers1Result = mainInstance.makeEnds(exampleNumbers1);
        System.out.println(Arrays.toString(exampleNumbers1Result));


       int[] exampleNumbers = {4, 5, 6};
       int[] numbersResult = mainInstance.makeLast(exampleNumbers);
        System.out.println(Arrays.toString(numbersResult));


        Map<String, Double> exampleOutput = new HashMap<>();
        exampleOutput.put("KITCHEN4001", 0.20);
        exampleOutput.put("GARAGE1070", 0.15);
        exampleOutput.put("LIVINGROOM", 0.10);

        String itemNumberExample = "GARAGE1070";

        double finalResult = mainInstance.isItOnSaleTho(exampleOutput, itemNumberExample);
        System.out.println(finalResult);

        int[] arrayOfInts = {7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<String> exampleInts = mainInstance.fizzBuzzList(arrayOfInts);
        System.out.println(exampleInts);

        Map<String, Integer> exampleMoney = new HashMap<>();
        exampleMoney.put("Peter", 101);
        exampleMoney.put("Paul", 500);

        Map<String, Integer> theResult = mainInstance.peterToPayPaul(exampleMoney);
        System.out.println(theResult);


    }


}