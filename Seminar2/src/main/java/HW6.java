import java.util.HashMap;

public class HW6 {
    private static HashMap <Integer, Object> hashMap = new HashMap<>();
    private static final Object my  = new Object();
    public static void main(String[] args) throws Exception {
        add(11);
        add(22);
        add(33);
        add(44);
        add(55);
        System.out.println(getString());

        System.out.println(getKey(0));
        System.out.println(getKey(4));
    }

    private static int getKey(int num) {
        return (Integer)hashMap.keySet().toArray()[num];
    }

    private static String getString(){
        return hashMap.keySet().toString();
    }

    public static void add(Integer numbers) {
        hashMap.put(numbers, my);
    }
}
