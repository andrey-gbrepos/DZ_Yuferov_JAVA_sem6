public class Program {
    public static void main(String[] args) {
       String name ="Иванов";
    
        PhoneBook рhoneBook = new PhoneBook();//Инициализация экземпляра класса PhoneBook
        //Добавление в телефонную книгу
        рhoneBook.add("Иванов", 368267235);
        рhoneBook.add("Петров", 989080808);
        рhoneBook.add("Петров", 989080978);
        рhoneBook.add("Сидоров", 697897797);
        рhoneBook.add("Сидоров", 697875775);
        рhoneBook.add("Сидоров", 697875543);
        //Вывод телефонной книги на печать
        System.out.println("Вывод телефонного справочника");
        PhoneBook.getPhoneBook();
        System.out.println();
        System.out.println("Поиск и вывод телефона абонента " + name);
        рhoneBook.find(name);
        System.out.println();
        System.out.println("Поиск несуществующего абонента ");
        рhoneBook.find("Васильев");
        System.out.println();
    }
}
