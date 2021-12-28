package lesson4.task2;

/**
 * Java1.Main
 *
 * @author Pavel.Stolyarov
 * @version 28.12.2021
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        PhoneBook phonebook = new PhoneBook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Иванов", "1234567");
        phonebook.add("Иванов", "7654321");
        phonebook.add("Петров", "2345678");
        phonebook.add("Сидоров", "8765432");
        phonebook.add("Иванов", "3456789");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Запись отсутствует");
        System.out.println("Васечкин");
        System.out.println(phonebook.get("Васечкин"));
        System.out.println("-----------------");

        System.out.println("Запись существующего номера");
        phonebook.add("Иванов", "9876543");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}