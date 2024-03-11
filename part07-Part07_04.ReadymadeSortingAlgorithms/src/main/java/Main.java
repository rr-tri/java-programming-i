
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        String[] stringArray = {"apple","pineapple","jackfruit","licchi"};
        Main.sort(stringArray);
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);
        sortIntegers(integerList);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");
        sortStrings(stringList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings);
    }
}
