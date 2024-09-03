package org.example;

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

    public static void main(String[] args) {

       Main mainInstance = new Main();

       int[] newNumbers = {2, 3, 4, 5};
       boolean theAnswer = mainInstance.has23(newNumbers);
        System.out.println(theAnswer);

        String theAnswer1 = mainInstance.greeting("Allison");
        System.out.println(theAnswer1);

        String exampleWordsAnswer = mainInstance.wordInMiddle("<<>>", "hello");
        System.out.println(exampleWordsAnswer);

    }


}