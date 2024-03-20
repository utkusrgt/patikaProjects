package MostUsedWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostUsedWord {
    public static void main(String[] args) {

        String text;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your text here : ");
        text = inp.nextLine();

        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", " ").split("\\s+");
        Map<String, Integer> wordCounter = new HashMap<>();

        for (String word : words){
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1 );
        }

        Map.Entry<String, Integer> mostUsedWord = null;
        for(Map.Entry<String, Integer> entry : wordCounter.entrySet()){
            if (mostUsedWord== null || entry.getValue() > mostUsedWord.getValue()){
                mostUsedWord = entry;
            }

        }


        //System.out.println(mostUsedWord.getKey() + "    " + mostUsedWord.getValue());
        if (mostUsedWord != null) {
            System.out.println("The most used word is: " + mostUsedWord.getKey());
            System.out.println("It appears " + mostUsedWord.getValue() + " times.");
        }else {
            System.out.println("No words found in the text.");
        }

    }

}
