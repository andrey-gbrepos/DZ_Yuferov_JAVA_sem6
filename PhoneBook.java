// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут 
// повторяющиеся имена с разными телефонами, их необходимо считать, 
// как одного человека с разными телефонами. Вывод должен быть отсортирован 
// по убыванию числа телефонов.


import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneList = new HashMap<>();

// Формирует новую запись абонента или добавляет номер при совпадении имени (ключа)
    public void add(String name, Integer phoneNum) {
        if (phoneList.containsKey(name)) {
                phoneList.get(name).add(phoneNum);
            } else {
                    ArrayList<Integer> values = new ArrayList<>();
                    values.add(phoneNum);
                    phoneList.put(name, values);
            }
        }
// Выводит номера телефонов по имени если оно есть в справочнике
    public void find(String name) {
        if (phoneList.containsKey(name)) {
            System.out.println(name + " " + phoneList.get(name));
            } else  
                    System.out.println(name + " " + "не найден");
        }

// Выводит отсортированный список всех абонентов
    public static void getPhoneBook() {  // Определение максимального числа номеров у абонентов
        int max = 1;
        int tmp = 1;
        for (var item : phoneList.entrySet()) {
                tmp = phoneList.get(item.getKey()).size();
                if (tmp > max) max = tmp;
            }
      
        while (max > 0)    // Сортировка и вывод списка абонентов в порядке убывания количества номеров
            {
             for (var item : phoneList.entrySet()){
                if(phoneList.get(item.getKey()).size() == max)
                System.out.println(item.getKey() + " " + item.getValue());   
                }
            max--;
            }
        }
}
  
  

   
    
