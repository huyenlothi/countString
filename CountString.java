import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = input.nextLine();
        String[] string = str.split(" ");
        Map<String,Integer> map = new TreeMap();
        for (String s : string) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int value = map.get(s);
                map.put(s, value + 1);
            }
        }
        System.out.println(map);
    }
}
