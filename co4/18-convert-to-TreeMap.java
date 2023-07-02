import java.util.*;

class HashMapToTreeMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<Integer, String> hashMap = new HashMap<>();

        System.out.print("Enter element count: ");
        int count = input.nextInt();

        System.out.printf("enter %d key-value pairs: ", count);
        for (int i = 0; i < count; i++) {
            int key = input.nextInt();
            String value = input.next();
            hashMap.put(key, value);
        }
        System.out.println("Current hash map: " + hashMap);

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("New tree map: " + treeMap);

        input.close();
    }
}