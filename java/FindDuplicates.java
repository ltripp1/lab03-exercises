import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class FindDuplicates {

    public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
        List<Integer> corrin = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i) == l.get(j)) {
                    if (!corrin.contains(l.get(i))) {
                        corrin.add(l.get(i));
                    }

                }
            }
        }

        return corrin;
    }

    public static List<Integer> findDuplicates(List<Integer> l) {
        HashMap<Integer, Integer> leo = new HashMap();
        List<Integer> corrin = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            Integer check = l.get(i);

            if (leo.containsKey(check)) {
                leo.put(check, leo.get(check) + 1);
            } else {
                leo.put(check, 1);
            }
        }

        List<Integer> ckdlol = new ArrayList<>(leo.keySet());
        for (int i = 0; i < ckdlol.size(); i++) {
            Integer check = ckdlol.get(i);
            if (leo.get(check) > 1) {
                corrin.add(check);
            }
        }
        return corrin;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicates(sample1));
        System.out.println("Sample 2: " + findDuplicates(sample2));
        System.out.println("Sample 3: " + findDuplicates(sample3));
        System.out.println("Sample 4: " + findDuplicates(sample4));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
    }

}
