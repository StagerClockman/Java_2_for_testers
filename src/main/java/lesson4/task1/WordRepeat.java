package lesson4.task1;

import java.util.*;

/**
 * Java1.WordRepeat
 *
 * @author Pavel.Stolyarov
 * @version 28.12.2021
 */
public class WordRepeat {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Hello", "World", "GeekBrains", "Good", "Bye",
                "Everyone", "hello", "world", "geekbrains", "good", "bye",
                "everyone", "Hello", "World", "GeekBrains", "Good", "Bye",
                "Everyone"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}