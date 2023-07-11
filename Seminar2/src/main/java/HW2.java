import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(str);
        String[] arrayStr1 = str.split(", ");
        StringBuilder resultSelect = List(str);
        System.out.println(resultSelect);
    }
        public static StringBuilder List(String str) {
            String str1 = str.replace("{", "").replace("}", "").replaceAll("\"", "");
            StringBuilder result = new StringBuilder();

            String[] arrayData = str1.split(", ");
            for (int i = 0; i < arrayData.length; i++) {
                String[] arrData = arrayData[i].split(":");
                if (arrData[1].equals("null") == false) {
                    if (i != 0) {
                        result.append(", ");
                        result.append(arrData[0]);
                        result.append(": ");
                        result.append(arrData[1]);
                    } else {
                        result.append(arrData[0]);
                        result.append(": ");
                        result.append(arrData[1]);
                    }
                }
            }
            return result;
    }
}