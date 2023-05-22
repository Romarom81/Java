package Seminar5.Htask5;



public class HT1 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.showAll(); // Телефонный справочник пуст.
        phonebook.add("Василий", 9324425);
        phonebook.add("Василий", 9324426);
        phonebook.add("Николай", 9955332);
        phonebook.showAll();
        phonebook.showByName("Игорь"); // По "Игорь" не найдено ни одной записи.
        phonebook.showByName("Василий");

    }
}
