import java.util.*;

public class HW5 {
    static HashMap<String, ArrayList<String>> tel = new HashMap<>();

    public static void main(String[] args) {
        tel = new HashMap<>();
        addContact("Сергей", "989992322");
        addContact("Вася", "9876543210");
        addContact("Ваня", "9876543210");
        addContact("Вася", "5432109876");
        addContact("Вася", "521432109876");
        addContact("Антон", "43243254356");
        addContact("Антон", "875843758");

        System.out.println("Телефонная книга:");

        for (HashMap.Entry entry: tel.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("\nОтсортированный телефонный список:");
        tel.entrySet().stream().sorted(Map.Entry.comparingByValue(new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o2.size() - o1.size();
            }
        })).forEach(System.out::println);
    }


    public static void addContact(String name, String phoneNumber) {
        if (tel.containsKey(name)) {
            tel.get(name).add(phoneNumber);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            tel.put(name, phoneNumbers);
        }
    }
}
