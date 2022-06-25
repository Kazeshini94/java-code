package DataStructures;

import java.util.*;

public class Dictionary {
    static Map<String, String> dictionaryDeToEn = new HashMap<>();
    static Map<String, String> dictionaryEnToDe = new HashMap<>();
    public static void main(String[] args) {

        add("Schule","School");
        add("Katze","Cat");
        add("Arbeitsplatz","Workplace");
        delete("Schule","School");

        System.out.println("German to English: " + dictionaryDeToEn);
        System.out.println("English to German: " + dictionaryEnToDe);
    }
    public static void delete(String german, String english) {
        dictionaryEnToDe.remove(english,german);
        dictionaryDeToEn.remove(german,english);
    }
    public static void add(String german, String english) {
        dictionaryDeToEn.put(german,english);
        dictionaryEnToDe.put(english,german);
    }
}

//        // Input for the Dictionary
//        ArrayList<String> german = new ArrayList<>
//                (Arrays.asList("Schule", "Katze", "Arbeitsplatz", "Hund", "Spiele", "Karten", "Scherz"));
//        ArrayList<String> english = new ArrayList<>
//                (Arrays.asList("School", "Cat", "Workplace", "Dog", "Games", "Cards", "Joke"));

//        for (int i = 0; i < german.size() && i < english.size(); i++) {
//            dictionaryDeToEn.put(german.get(i), english.get(i));
//            if (dictionaryDeToEn.containsKey(german.get(i))) {
//                dictionaryEnToDe.put(english.get(i), german.get(i));
//            }
//        }