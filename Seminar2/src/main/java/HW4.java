import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class HW4 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        while (true) {
            //System.out.println("Введите фамилию - ");
            name.add(scanner.nextLine());
            //System.out.println("Введите имя - ");
            surname.add(scanner.nextLine());
            //System.out.println("Введите отчество - ");
            patronymic.add(scanner.nextLine());
            //System.out.println("Введите возраст - ");
            age.add(Integer.valueOf(scanner.nextLine()));
            //System.out.println("Введите пол - ");
            gender.add(scanner.nextLine());
            id.add(age.size()-1);
            //System.out.println("Продолжить ввод да/нет? - ");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("нет")) break;
        }
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("%s %s.%s. %s %s\n", name.get(i), surname.get(i).charAt(0), patronymic.get(i).charAt(0), gender.get(i), age.get(i));
        }
        id.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return age.get(o1) - age.get(o2);
            }

        });
        System.out.println("\nОтсортированный список по возрасту");
        for (int i = 0; i < age.size(); i++) {
            System.out.printf("%s %s.%s. %s %s\n", name.get(id.get(i)), surname.get(id.get(i)).charAt(0), patronymic.get(id.get(i)).charAt(0), gender.get(id.get(i)), age.get(id.get(i)));
        }
    }
}
