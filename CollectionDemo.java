import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

    public static void main(String[] args) {
        // ArrayList Demo
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple");
        System.out.println("ArrayList: " + arrayList);

        // Sorting ArrayList
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // HashSet Demo
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicates are automatically removed
        System.out.println("HashSet: " + hashSet);

        // Checking if HashSet contains an element
        boolean containsCherry = hashSet.contains("Cherry");
        System.out.println("HashSet contains Cherry: " + containsCherry);
    }
}
