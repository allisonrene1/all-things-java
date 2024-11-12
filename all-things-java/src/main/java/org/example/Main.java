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


    public boolean double23(int[] numbers) {

        if(numbers[0] == 2 && numbers[1] == 2 || numbers[0] == 3 || numbers[1] == 3) {
        return true;
        }
        return false;

    }

    // cut the array in half and search both to find the value, don't go sequentially

    public String binarySearch(int[] numbers, int value) {

        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        boolean isFound = false;
        while (lowIndex <= highIndex && !isFound){
            int middle = ((highIndex - lowIndex) / 2) + lowIndex;
            if (value < numbers[middle]){
                highIndex = middle - 1;
            } else if (value > numbers[middle]){
                lowIndex = middle + 1;
            } else {
                return "Found it!";
            }
        }
        if (!isFound){
            return "Didn't find it!";
        }

    return "something isn't working";

    }



    public boolean evenlySpaced(int a, int b, int c){

        int[] array = {a, b, c};

        sort(array);

        return (array[1] - array[0] == array[2] - array[1]);

    }

    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }



    public int[] fix23(int[] numbers) {

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 2) {
                if(numbers[i] + 1 == 3) {
                    numbers[i + 1] = 0;
                }
            }
        }
        return numbers;
    }



    public boolean noTriples(int[] numbers) {

        for(int i = 0; i < numbers.length - 2; i++) {
            if(numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 2]) {
                return false;
            }
        }
        return true;

    }


    public int[] swapEnds(int[] numbers) {

        int tempHolder = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = tempHolder;
        return numbers;

    }



    public boolean arrayFront9(int[] nums) {

        int theLimit = Math.min(nums.length, 4);

        for(int i = 0; i < theLimit; i++) {
            if(nums[i] == 9) {
                return true;
            }
        }

        return false;
    }



    public boolean foundIntTwice(List<Integer> numbers, int value) {

        int counter = 0;
        for(int i = 0; i < numbers.size(); i++)
                if(value == numbers.get(i)) {
                    counter++;
                }
                if(counter >= 2) {
                    return true;
                }
        return false;

        };


    public String comboStrings(String a, String b) {

        if(a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }

    }


    public int countXXX(String str) {

        int countOf = 0;

        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                countOf++;
            }
        }

        return countOf;
    }


    public boolean more14(int[] nums) {

        int counter1 = 0;
        int counter4 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                counter1++;
            } else if(nums[i] == 4) {
                counter4++;
            }
        }

        if(counter1 > counter4) {
            return true;
        }

        return false;
    }


    public boolean array123(int[] nums) {

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }

        }
        return false;
    }

//    Create a method called no4LetterWords that takes in an array of strings called strings.
//    Return a List containing the elements of strings in the same order except for any that contain exactly 4 characters.
//
//    For example:
//
//    no4LetterWords( {"Train", "Boat", "Car"} ) →   ["Train", "Car"]
//    no4LetterWords( {"Red", "White", "Blue"} ) →   ["Red", "White"]


    public List<String> no4LetterWordss(String[] strings) {

        List<String> newList = new ArrayList<>();

        for(int i = 0; i < strings.length; i++) {
            if(strings[i].length() < 4 || strings[i].length() > 4) {
                newList.add(strings[i]);
            }
        }


        return newList;
    }


    public int sumOdds() {
        int number = 0;
        for(int i = 1; i < 101; i++) {

            if(i % 2 == 1) {
                number = number + i;
            }
        }
        return number;
    }


    public int sumOddsBetweenValues(int start, int end) {

        int sumOfOdds = 0;

        for(int i = start; i <= end; i++) {

            if(i % 2 == 1) {
                sumOfOdds = sumOfOdds + i;
            }

        }
        return sumOfOdds;
    }



    public int[] fzzArray3(int start, int end) {

        int[] newArray = new int[end - start];

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = start + i;

        }

        return newArray;
    }



    public boolean isStrictlyIncreasing(int[] numbers) {


        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] >= numbers[i + 1]) {
                return false;
            }

        }
        return true;
    };



    public boolean hasBad(String str) {

        if(str.substring(0,2).contains("ba")) {
            return true;
        } else if(str.substring(1,3).contains("ba")) {
            return true;
        }

        return false;
    }


    public String reverseString(String str) {

        String newString = "";
        char character;

        for(int i = 0; i < str.length(); i++) {
           character = str.charAt(i);
           newString = character + newString;

        }

        return newString;
    }



    public String frontTimes(String string, int number) {

        String newString = "";


            if(string.length() < 3) {
                String repeated = string.repeat(number);
                return repeated;
            } else {
                newString = string.substring(0, 3);
                String repeated = newString.repeat(number);
                return repeated;
            }

    }

    public List<String> reverseList(List<String> strings) {

        List<String> theNewList = new ArrayList<>();

        for(int i = strings.size() - 1; i >= 0; i--) {

            theNewList.add(strings.get(i));

        }

        return theNewList;
    }



    public String[] list2Arrays(List<String> strings) {

        String[] newStringArray = new String[strings.size()];

        for(int i = 0; i < strings.size(); i++) {

            newStringArray[i] = strings.get(i);

        }

        return newStringArray;

    }


    public int findLargest(List<Integer> numbers) {

        int largestValue = 0;

        for(int i = 0; i < numbers.size() -1; i++) {

            if(largestValue < numbers.get(i)) {
                largestValue = numbers.get(i);
            }

        }

        return largestValue;
    };


    public List<String> distinctValues(List<String> strings) {

        List<String> newStringList = new ArrayList<>();

        for(int i = 0; i < strings.size(); i ++) {

            if(!newStringList.contains(strings.get(i))) {
                newStringList.add(strings.get(i));
            }

        }

        return newStringList;
    }


    public List<String> array2List(String[] strings) {

        List<String> newList = new ArrayList<>();

        for(int i = 0; i < strings.length; i++) {

            newList.add(strings[i]);

        }

        return newList;

    }


    public List<Double> arrayInt2ListDouble(int[] integers) {

        List<Double> newDoubleList = new ArrayList<>();

        for(int i = 0; i < integers.length; i++) {

            newDoubleList.add(integers[i] / 2.0);

        }

        return newDoubleList;
    }


    public int[] makeMiddle(int[] numbers) {

        int[] newNumbers = new int[2];

        int middleOfArray = numbers.length / 2;

      newNumbers[0] = numbers[middleOfArray - 1];
      newNumbers[1] = numbers[middleOfArray];


        return newNumbers;
    }


//    Create a method called blackjack that takes in two integers, a and b.
//    Return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//
//    For example:
//
//    blackjack(19, 21) → 21
//    blackjack(21, 19) → 21
//    blackjack(19, 22) → 19

    public int blackjack(int a, int b) {

        if(a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        }

        int sumA = 21 - a;
        int sumB = 21 - b;

        if(sumA < sumB) {
            return a;
        } else {
            return b;
        }

    }


    public static void main(String[] args) {

       Main mainInstance = new Main();

       int finalResult = mainInstance.blackjack(16, 17);
        System.out.println(finalResult);

        int[] exampleNumbers = new int[] {7, 1, 2, 3, 4, 9};
        int[] theResult = mainInstance.makeMiddle(exampleNumbers);
        System.out.println(Arrays.toString(theResult));

    }


}