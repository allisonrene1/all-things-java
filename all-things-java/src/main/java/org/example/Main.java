package org.example;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {

       Main mainInstance = new Main();

       int[] newNumbers = {2, 3, 4, 5};
       boolean theAnswer = mainInstance.has23(newNumbers);
        System.out.println(theAnswer);

        String theAnswer1 = mainInstance.greeting("Allison");
        System.out.println(theAnswer1);

        String exampleWordsAnswer = mainInstance.wordInMiddle("<<>>", "hello");
        System.out.println(exampleWordsAnswer);

        String theAnswer2 = mainInstance.firstHalf("WhatThat");
        System.out.println(theAnswer2);

        String[] exampleWords = new String[] {"yes", "okay", "no thank you", "goodbye"};
        List<String> exampleWords1 = mainInstance.sameOrder(exampleWords);
        System.out.println(exampleWords1);


    }


}